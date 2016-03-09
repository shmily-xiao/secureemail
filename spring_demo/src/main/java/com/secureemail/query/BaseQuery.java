package com.secureemail.query;

/**
 * Created by JenKin on 2016/3/9.
 */
public abstract class BaseQuery {
    /**
     * 第几页
     */
    protected int pageIndex = 0;

    /**
     * 每一页显示的记录数
     */
    protected int pageSize = 10;

    /**
     * 一共的页数
     */
    protected int totalPages;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
