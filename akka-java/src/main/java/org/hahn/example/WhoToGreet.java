package org.hahn.example;

import java.io.Serializable;

/**
 * Created by jianghan on 16-3-11.
 */
public class WhoToGreet implements Serializable {

    public final String who;

    public WhoToGreet(String who) {
        this.who = who;
    }

}
