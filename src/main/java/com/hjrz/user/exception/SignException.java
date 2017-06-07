package com.hjrz.user.exception;

/**
 * @ClassName SignException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年5月23日 下午2:02:57
 * @version 1.0.0
 */
public class SignException extends UserException{

  /**
   * @Field @serialVersionUID : TODO(这里用一句话描述这个类的作用)
   */
  private static final long serialVersionUID = 2314401715161928713L;

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   */
  public SignException() {
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
  public SignException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   * @param cause
   */
  public SignException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param message
   */
  public SignException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @Description TODO(这里用一句话描述这个方法的作用)
   * @param cause
   */
  public SignException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }
      
}
