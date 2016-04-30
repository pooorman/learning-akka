package org.hahn.example;

import java.io.Serializable;

/**
 * Created by jianghan on 16-3-11.
 */
public class Greeting implements Serializable {

    public final String message;

    public Greeting(String message) {
        this.message = message;
    }

}
