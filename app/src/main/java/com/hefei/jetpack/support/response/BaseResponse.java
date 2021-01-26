package com.hefei.jetpack.support.response;

import com.blankj.utilcode.util.GsonUtils;

import org.jetbrains.annotations.NotNull;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/08/18
 *     desc  :
 * </pre>
 */
public class BaseResponse<T> {

    private T data;
    private int status;

    private int page;
    private int page_count;
    private int total_counts;

    @NotNull
    @Override
    public String toString() {
        return GsonUtils.toJson(this);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public int getTotal_counts() {
        return total_counts;
    }

    public void setTotal_counts(int total_counts) {
        this.total_counts = total_counts;
    }
}
