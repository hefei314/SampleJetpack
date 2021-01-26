package com.hefei.jetpack.support.entity;

import java.util.List;

/**
 * <pre>
 *     author: hefei
 *     time  : 2020/09/10
 *     desc  :
 * </pre>
 */
public class CategoryDetailBean {

    /**
     * _id : 5f0fe631ee6ba981da2af3c2
     * author : KunMinX
     * category : Article
     * createdAt : 2020-07-16 13:31:29
     * desc : MVP 和 MVVM 的关系，就像雷锋与雷峰塔的关系
     * images : ["https://gank.io/images/5e5413c8422848aa8a50540797488412"]
     * likeCounts : 0
     * publishedAt : 2020-07-16 13:31:29
     * stars : 1
     * title : 是让人 提神醒脑 的 MVP、MVVM 关系精讲！
     * type : Android
     * url : gank://0e2b304647d042c5b67aadc36c032bc5
     * views : 17
     */

    private String _id;
    private String author;
    private String category;
    private String createdAt;
    private String desc;
    private int likeCounts;
    private String publishedAt;
    private int stars;
    private String title;
    private String type;
    private String url;
    private int views;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(int likeCounts) {
        this.likeCounts = likeCounts;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
