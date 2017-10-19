package com.hjrz.user.constants;

public enum FeedBackEnum {
	ALREADY(1,"已经处理"),PENDING(2,"待处理"),IGNORE(3,"已忽略"),DELETED(4,"已删除");
	  
    private int code;
    
    private String desc;

    private FeedBackEnum(int code, String desc) {
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
