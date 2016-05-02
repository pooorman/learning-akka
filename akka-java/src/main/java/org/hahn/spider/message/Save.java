package org.hahn.spider.message;

import java.io.Serializable;

/**
 * Created by jianghan on 16/5/2.
 */
public class Save implements Serializable {

    private String url;

    public Save(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return String.format("Save[url=%s]", url);
    }
}
