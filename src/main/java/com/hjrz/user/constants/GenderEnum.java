package com.hjrz.user.constants;

/**
 * @ClassName GenderEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月31日 下午5:34:58
 * @version 1.0.0
 */
public enum GenderEnum {
      MAN(1,"男"),WOMAN(2,"女");
  
      private int code;
      
      private String desc;

      private GenderEnum(int code, String desc) {
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
