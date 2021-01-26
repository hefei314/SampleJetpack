package com.hefei.jetpack.support.entity;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public class CategoryBean {

    /**
     * _id : 5e5a25346e851660b43ec6bc
     * coverImageUrl : http://gank.io/images/c1ce555daf954961a05a69e64892b2cc
     * desc : The man who has made up his mind to win will never say “ Impossible”。（ Napoleon ）
     * title : Flutter
     * type : Flutter
     */

    private String _id;
    private String coverImageUrl;
    private String desc;
    private String title;
    private String type;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
