package com.hjrz.user.service;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjrz.user.constants.UserStateEnum;
import com.hjrz.user.dao.User_basic_infoMapper;
import com.hjrz.user.dao.User_detail_infoMapper;
import com.hjrz.user.entity.User_basic_info;
import com.hjrz.user.entity.User_detail_info;
import com.hjrz.user.exception.LoginException;
import com.hjrz.user.exception.SYSException;
import com.hjrz.user.form.LoginUserForm;
import com.hjrz.user.model.UserModel;
import com.hjrz.user.util.AbstractCacheService;
import com.hjrz.user.util.EncryptUtil;
import com.hjrz.user.util.WebCookieComponent;

/**
 * @ClassName LoginService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:43:16
 * @version 1.0.0
 */
@Service("LoginService")
public class LoginService {
	  @Autowired
	  private AbstractCacheService redisCache;
	
      @Autowired
      private User_basic_infoMapper user_basic_infoMapper;
      
      @Autowired
      private User_detail_infoMapper user_detail_infoMapper;
      
      private static final String cookieName = "HJRZ-userLogin";
      
      /**
       * @Description (登录)
       * @author RudolphLiu
       * @Date 2017年5月31日 上午10:10:06
       */
      public void userLogin(LoginUserForm loginUserForm,HttpServletRequest request,HttpServletResponse response)
        throws LoginException
      {
    	  User_basic_info user_basic_info = new User_basic_info();
    	  
    	  //取得用户输入的MD5值密码与数据库中的相比较
    	  String encryptPassword = EncryptUtil.getMD5String(loginUserForm.getUser_password());
    	  //存入实体传给DAO层
    	  user_basic_info.setUser_login_phone(loginUserForm.getUser_login_phone());
    	  user_basic_info.setUser_password(encryptPassword);
    	  //开始执行登录
    	  User_basic_info user = user_basic_infoMapper.userLogin(user_basic_info);
    	  if(user == null)
    	  {
    		  throw new LoginException("手机号或密码不正确");
    	  }
    	  if(user.getUser_info_state()!=UserStateEnum.EXISTENCE)
    	  {
    		  throw new LoginException("账户"+loginUserForm.getUser_login_phone()+"不可用，请联系管理员");
    	  }
    	  //添加与创建生命周期为一天的Cookie
    	  Cookie loginCookie = WebCookieComponent.createCookie(LoginService.cookieName,WebCookieComponent.createSecrectCookieValue());
    	  response.addCookie(loginCookie);
    	  UserModel mo = new UserModel();
    	  mo.setUser_basic_Code(user.getUser_basic_Code());
    	  mo.setUser_login_phone(user.getUser_login_phone());
    	  mo.setUser_password(user.getUser_password());
    	  mo.setUser_info_state(user.getUser_info_state());
    	  mo.setUser_email(user.getUser_detail_info().getUser_email());
    	  mo.setUser_realname(user.getUser_detail_info().getUser_realname());
    	  mo.setUser_sex(user.getUser_detail_info().getUser_sex());
    	  mo.setUser_address(user.getUser_detail_info().getUser_address());
    	  request.getSession().setAttribute("userdata",mo);
    	  //存入redis
    	  redisCache.putKey(loginCookie.getValue(),user,AbstractCacheService.HALFDAY);
      }

      /**
       * @Description (通过BasicID获取用户详细信息)
       * @author RudolphLiu
       * @Date 2017年6月6日 下午9:21:12
       */
      public User_detail_info getUserDetail(int user_basic_Code)
        throws LoginException,SYSException,IllegalAccessException,InvocationTargetException
      {
          if(user_basic_Code==0||Integer.toString(user_basic_Code).equals("")){
              throw new SYSException("系统异常，请联系管理员");
          }
          User_detail_info user_detail_info = user_detail_infoMapper.selectByUserBasicID(user_basic_Code);
          return user_detail_info;
      }
      
      
      /**
       * @Description (用户登出，注销...)
       * @author RudolphLiu
       * @Date 2017年6月7日 下午5:31:32
       */
      public void logout(HttpServletRequest request,HttpServletResponse response)
        throws LoginException,IllegalAccessException,InvocationTargetException
      {
    	  //先获得Cookie
          Cookie loginCookie
           = WebCookieComponent.getCookie(request,LoginService.cookieName);
          //用Cookie去查redis，删除redis
          if(loginCookie != null){
        	  redisCache.removeCache(loginCookie.getValue());
          }
          //再删除Cookie
          response.addCookie(WebCookieComponent.removeCookie(LoginService.cookieName));
      }
}
