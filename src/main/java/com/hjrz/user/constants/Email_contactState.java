package com.hjrz.user.constants;

/**
 * @ClassName Email_contactState
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 上午10:32:07
 * @version 1.0.0
 */
public enum Email_contactState {
    ALREADY(1,"已经处理"),PENDING(2,"待处理"),IGNORE(3,"已忽略"),DELETED(4,"已删除");
  
    private int code;
    
    private String desc;

    private Email_contactState(int code, String desc) {
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
