package org.hahn.spider.message;

import java.io.Serializable;

public class Index implements Serializable {

    private IndexType type;
    private String url;
    private String title;
    private String content;

    public Index(IndexType type, String url, String title, String content) {
        this.type = type;
        this.url = url;
        this.title = title;
        this.content = content;
    }

    public IndexType getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format("Index[type=%s,url=%s,title=%s]", type, url, title);
    }
}
