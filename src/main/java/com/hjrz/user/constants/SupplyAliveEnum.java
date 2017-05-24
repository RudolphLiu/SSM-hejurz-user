package com.hjrz.user.constants;

/**
 * @ClassName SupplyAliveEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月24日 下午1:34:11
 * @version 1.0.0
 */
public enum SupplyAliveEnum {
    EXISTENCE(1,"存在"),REVOKE(2,"已撤销");
  
      private int code;
      
      private String desc;

      private SupplyAliveEnum(int code, String desc) {
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
