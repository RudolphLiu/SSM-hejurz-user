package com.hjrz.user.data;

import java.util.Date;

import com.hjrz.user.constants.DynamicStateEnum;

/**
 * @ClassName DynamicQuery
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月5日 下午5:55:33
 * @version 1.0.0
 */
public class DynamicQuery extends BaseQuery{
    
      private String dyTitle;
      
      private String dycontent;
      
      private String dyimageCover;
      
      private Date create_time;
      
      private String create_admin;
      
      private DynamicStateEnum dyAliveState;

      public String getDyTitle() {
        return dyTitle;
      }

      public String getDycontent() {
        return dycontent;
      }

      public String getDyimageCover() {
        return dyimageCover;
      }

      public Date getCreate_time() {
        return create_time;
      }

      public String getCreate_admin() {
        return create_admin;
      }

      public DynamicStateEnum getDyAliveState() {
        return dyAliveState;
      }

      public void setDyTitle(String dyTitle) {
        this.dyTitle = dyTitle;
      }

      public void setDycontent(String dycontent) {
        this.dycontent = dycontent;
      }

      public void setDyimageCover(String dyimageCover) {
        this.dyimageCover = dyimageCover;
      }

      public void setCreate_time(Date create_time) {
        this.create_time = create_time;
      }

      public void setCreate_admin(String create_admin) {
        this.create_admin = create_admin;
      }

      public void setDyAliveState(DynamicStateEnum dyAliveState) {
        this.dyAliveState = dyAliveState;
      }
}
