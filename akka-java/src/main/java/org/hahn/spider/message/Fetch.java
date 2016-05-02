package org.hahn.spider.message;

import java.io.Serializable;

/**
 * Created by jianghan on 16/5/2.
 */
public class Fetch implements Serializable {

    private String url;
    private int tryNum;

    public Fetch(String url, int tryNum) {
        this.url = url;
        this.tryNum = tryNum;
    }

    public int getTryNum() {
        return tryNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTryNum(int tryNum) {
        this.tryNum = tryNum;
    }

    @Override
    public String toString() {
        return String.format("Fetch[url=%s,tryNum=%d]", url, tryNum);
    }

}
