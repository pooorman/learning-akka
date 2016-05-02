package org.hahn.spider.message;

import java.io.Serializable;

/**
 * Created by jianghan on 16/5/2.
 */
public class Extract implements Serializable {

    private String url;
    private byte[] content;

    public Extract(String url, byte[] content) {
        this.url = url;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format("Extract[url=%s]", url);
    }
}
