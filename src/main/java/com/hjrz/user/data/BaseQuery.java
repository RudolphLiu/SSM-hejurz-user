package com.hjrz.user.data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hjrz.user.model.MySQLPager;
import com.hjrz.user.util.HJRZDateTimeUtil;

/**
 * @ClassName BaseQuery
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月5日 下午5:55:49
 * @version 1.0.0
 */
public class BaseQuery {
    //根据主键查询
    private Long id;
    
    //排序方式
    private String orderBy;
    
    private MySQLPager pager = new MySQLPager();
    
 // 时间范围统一用startTime,endTime
    @DateTimeFormat(iso = ISO.DATE_TIME, pattern = HJRZDateTimeUtil.YYYY_MM_DD_HH_MM_SS_DASH)
    @JsonFormat(pattern = HJRZDateTimeUtil.YYYY_MM_DD_HH_MM_SS_DASH, timezone = "Asia/Shanghai")
    private Date startDateTime;

    @DateTimeFormat(iso = ISO.DATE_TIME, pattern = HJRZDateTimeUtil.YYYY_MM_DD_HH_MM_SS_DASH)
    @JsonFormat(pattern = HJRZDateTimeUtil.YYYY_MM_DD_HH_MM_SS_DASH, timezone = "Asia/Shanghai")
    private Date endDateTime;

    public Long getId() {
      return id;
    }

    public String getOrderBy() {
      return orderBy;
    }

    public MySQLPager getPager() {
      return pager;
    }

    public Date getStartDateTime() {
      return startDateTime;
    }

    public Date getEndDateTime() {
      return endDateTime;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public void setOrderBy(String orderBy) {
      this.orderBy = orderBy;
    }

    public void setPager(MySQLPager pager) {
      this.pager = pager;
    }

    public void setStartDateTime(Date startDateTime) {
      this.startDateTime = startDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
      this.endDateTime = endDateTime;
    }
    
    
}
