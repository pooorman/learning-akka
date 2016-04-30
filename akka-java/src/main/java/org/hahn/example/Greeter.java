package org.hahn.example;

import akka.actor.UntypedActor;

/**
 * Created by jianghan on 16-3-11.
 */
public class Greeter extends UntypedActor {

    String greeting = "";

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof WhoToGreet) {
            greeting = "hello, " + ((WhoToGreet) message).who;
        } else if (message instanceof Greet) {
            getSender().tell(new Greeting(greeting), getSelf());
        } else {
            unhandled(message);
        }
    }

}
