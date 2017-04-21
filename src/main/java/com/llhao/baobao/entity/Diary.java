package com.llhao.baobao.entity;

/**
 * Created by HAO zong on 2017-4-16.
 */
public class Diary {
    private long id;
    private String title;
    private String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
