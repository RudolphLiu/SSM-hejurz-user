package com.hjrz.user.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class WebCookieComponent {
	
	private static final int expire = 24 * 60 * 60;
	
	public static String createSecrectCookieValue()
	{
		return EncryptUtil.getMD5String(RandomStringUtils.randomNumeric(2)
				+ HJRZDateTimeUtil.getNowTimestamp(HJRZDateTimeUtil.YYYYMMDDHHMMssSSS)
				+ RandomStringUtils.randomNumeric(2));
	}
	
	
	/**
	 * @author RodulphLiu
	 * @description createCookie (固定一天)
	 * @date 2017年10月20日
	 * @version 1.0
	 */
	public static Cookie createCookie(String name,String value)
	{
			Cookie cookie = new Cookie(name, value);
		    cookie.setPath("/");
		    cookie.setMaxAge(expire);
		    return cookie;
	}
	
	/**
	 * @author RodulphLiu
	 * @description createCookie(自定义时间)
	 * @date 2017年10月20日
	 * @version 1.0
	 */
	public static Cookie createCookie(String name,String value,int time)
	{
		Cookie cookie = new Cookie(name, value);
		cookie.setPath("/");
		cookie.setMaxAge(time);
		return cookie;
	}
	
	/**
	 * @author RodulphLiu
	 * @description removeCookie(删除Cookie)
	 * @date 2017年10月20日
	 * @version 1.0
	 */
	public static Cookie removeCookie(String key) {
	    Cookie cookie = new Cookie(key, "");
	    cookie.setPath("/");
	    cookie.setMaxAge(-1);
	    return cookie;
	}

	 /**
	   * 获取request中含有key的cookie,没有则返回Null
	   */
	  public static Cookie getCookie(HttpServletRequest request, String key) {
	    Cookie[] cookies = request.getCookies();
	    if (cookies != null && cookies.length > 0){
	      for (Cookie cookie : cookies) {
	        if (StringUtils.equals(cookie.getName(), key)) {
	          return cookie;
	        }
	      }
	    }
	    return null;
	  }
	  
	  /**
	 * @author RodulphLiu
	 * @description getCookieByName(从Map取Cookie)
	 * @date 2017年10月20日
	 * @version 1.0
	 */
	public static Cookie getCookieByName(HttpServletRequest request,String name){
		    Map<String,Cookie> cookieMap = ReadCookieMap(request);
		    if(cookieMap.containsKey(name)){
		        Cookie cookie = (Cookie)cookieMap.get(name);
		        return cookie;
		    }else{
		        return null;
		    }   
		}
	  
	  private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){  
		    Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
		    Cookie[] cookies = request.getCookies();
		    if(null!=cookies){
		        for(Cookie cookie : cookies){
		            cookieMap.put(cookie.getName(), cookie);
		        }
		    }
		    return cookieMap;
		}
}
