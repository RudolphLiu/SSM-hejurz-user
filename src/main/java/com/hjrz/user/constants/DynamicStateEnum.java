package com.hjrz.user.constants;

/**
 * @ClassName DynamicStateEnum
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月6日 下午2:26:22
 * @version 1.0.0
 */
public enum DynamicStateEnum {
      ALIVE(1,"存在"),DELETED(2,"已删除"),PENDING(3,"待审核");
  
      private int code;
      
      private String desc;

      private DynamicStateEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
      }

      public int getCode() {
        return code;
      }

      public String getDesc() {
        return desc;
      }

      public void setCode(int code) {
        this.code = code;
      }

      public void setDesc(String desc) {
        this.desc = desc;
      }
      
      
}
