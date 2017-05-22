package com.hjrz.user.exception;

/**
 * @ClassName SYSException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:51:01
 * @version 1.0.0
 */
public class SYSException extends UserException{

  private static final long serialVersionUID = -572872193945947504L;

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   */
  public SYSException() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public SYSException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   */
  public SYSException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   */
  public SYSException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param cause
   */
  public SYSException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }

  
}
