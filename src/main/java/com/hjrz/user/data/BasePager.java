package com.hjrz.user.data;

/**
 * @ClassName BasePager
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月5日 下午6:03:01
 * @version 1.0.0
 */
public class BasePager {
    //默认的页面条数
    protected int pageSize = 10;
    
    //总条数
    protected int totoalResults;
    
    //当前页，从1开始
    protected int currentPage = 1;
    
    protected int totalPages;
    
    public void reset(){
        this.currentPage = 1;
        this.totalPages = 0;
        this.totoalResults = 0;
    }
    
    public int getPageSize() {
      return pageSize;
    }

    public int getTotoalResults() {
      return totoalResults;
    }

    public int getCurrentPage() {
      return currentPage;
    }

    public int getTotalPages() {
      return totalPages;
    }

    public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
    }

    public void setTotoalResults(int totoalResults) {
      this.totoalResults = totoalResults;
    }

    public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
    }

    public void setTotalPages(int totalPages) {
      this.totalPages = totalPages;
    }
    
}
