package org.hahn.example;

import akka.actor.UntypedActor;

/**
 * Created by jianghan on 16-3-10.
 */
public class GreetPrinter extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Greeting) {
            System.out.println(((Greeting) message).message);
        }
    }

}
