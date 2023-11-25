package com.sxqibo.spring3admin.req;

public class PageReq {

    private int page;

    private int size;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
