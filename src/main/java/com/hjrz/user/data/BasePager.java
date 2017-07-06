package com.hjrz.user.data;

/**
 * @ClassName BasePager
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月5日 下午6:03:01
 * @version 1.0.0
 */
public class BasePager {
    @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + currentPage;
    result = prime * result + pageSize;
    result = prime * result + totalPages;
    result = prime * result + totoalResults;
    return result;
  }

    public BasePager(int pageSize, int currentPage) {
      super();
      this.pageSize = pageSize;
      this.currentPage = currentPage;
    }

    public BasePager() {
      super();
      // TODO Auto-generated constructor stub
    }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BasePager other = (BasePager) obj;
    if (currentPage != other.currentPage)
      return false;
    if (pageSize != other.pageSize)
      return false;
    if (totalPages != other.totalPages)
      return false;
    if (totoalResults != other.totoalResults)
      return false;
    return true;
  }

    //默认的页面条数
    protected int pageSize = 10;
    
    //总条数
    protected int totoalResults;
    
    //当前页，从1开始
    protected int currentPage = 1;
    
    protected int totalPages;
    
    public void reset() {
      this.currentPage = 1;
      this.totalPages = 0;
      this.totoalResults = 0;
    }

    public int getTotalPages() {
      if (getTotoalResults() > 0) {
        if (getTotoalResults() % getPageSize() == 0) {
          this.totalPages = getTotoalResults() / getPageSize();
        }

        if (getTotoalResults() % getPageSize() != 0) {
          this.totalPages = (getTotoalResults() / getPageSize()) + 1;
        }
      }
      return totalPages;
    }

    public void setTotalPages(int totalPages) {
      this.totalPages = totalPages;
    }

    public int getPageSize() {
      /*if (pageSize >= 100) {
        pageSize = 10;
      }*/
      return pageSize;
    }

    public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
    }

    public int getTotoalResults() {
      return totoalResults;
    }

    public void setTotoalResults(int totoalResults) {
      this.totoalResults = totoalResults;
    }

    public int getCurrentPage() {
      return currentPage;
    }

    public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
    }
}
