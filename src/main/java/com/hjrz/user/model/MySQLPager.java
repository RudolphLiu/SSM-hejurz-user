package com.hjrz.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hjrz.user.data.BasePager;

/**
 * @ClassName MySQLPager
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月6日 下午1:45:20
 * @version 1.0.0
 */
public class MySQLPager extends BasePager{
      /**
       * TODO 简单描述该方法的实现功能（可选）.
       * @see java.lang.Object#toString()
       */
      @Override
      public String toString() {
        return super.toString() + "MySQLPager [offset=" + offset + ", limit=" + limit + ", pageSize=" + pageSize
            + ", totoalResults=" + totoalResults + ", currentPage=" + currentPage + ", totalPages="
            + totalPages + "]";
      }
    
      public MySQLPager(int pageSize, int currentPage) {
        super(pageSize, currentPage);
      }
    
      public MySQLPager() {
        super();
      }
      
      // MySQL起始条数,0开始
      @JsonIgnore
      private int offset;
    
      @JsonIgnore
      private int limit;
    
    
      public int getOffset() {
        this.offset = (getCurrentPage() - 1) * getPageSize();
        return offset;
      }
    
      public void setOffset(int offset) {
        this.offset = offset;
      }
    
      public int getLimit() {
        if (limit == 0) {
          limit = getPageSize();
        }
        return limit;
      }
    
      public void setLimit(int limit) {
        this.limit = limit;
      }
}
