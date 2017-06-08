package com.hjrz.user.constants;

/**
 * @ClassName HandleModeEnum
 * @Description TODO(用户反馈消息处理方式)
 * @author RudolphLiu
 * @Date 2017年6月8日 下午4:11:00
 * @version 1.0.0
 */
public enum HandleModeEnum {
    INFORMATION(1,"消息处理"),EMAIL(2,"邮件处理"),ARTIFICIAL(3,"人工处理");
    
    private int Code;
  
    private String desc;
    
    private HandleModeEnum(int code, String desc) {
      Code = code;
      this.desc = desc;
    }

    public int getCode() {
      return Code;
    }

    public void setCode(int code) {
      Code = code;
    }

    public String getDesc() {
      return desc;
    }

    public void setDesc(String desc) {
      this.desc = desc;
    }
    
    
}
