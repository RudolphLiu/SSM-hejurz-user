package com.hjrz.user.constants;

/**
 * @ClassName UserStateEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午3:04:32
 * @version 1.0.0
 */
public enum UserStateEnum {
      EXISTENCE(1,"存在"),FROZEN(2,"冻结");
      
      private int code;
  
      private String desc;

      private UserStateEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
      }

      public int getCode() {
        return code;
      }

      public void setCode(int code) {
        this.code = code;
      }

      public String getDesc() {
        return desc;
      }

      public void setDesc(String desc) {
        this.desc = desc;
      }
      
      
}
