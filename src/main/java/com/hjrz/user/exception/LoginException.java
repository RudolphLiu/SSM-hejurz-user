package com.hjrz.user.exception;

/**
 * @ClassName LoginException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月22日 下午5:51:42
 * @version 1.0.0
 */
public class LoginException extends UserException {

  private static final long serialVersionUID = -7156753021376193886L;

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   */
  public LoginException() {
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
  public LoginException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   */
  public LoginException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   */
  public LoginException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param cause
   */
  public LoginException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }
  
}
