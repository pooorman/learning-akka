package org.hahn.spider.actor;

import akka.actor.UntypedActor;
import org.hahn.spider.message.Index;

/**
 * Created by jianghan on 16/5/2.
 */
public class BuildIndex extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Index) {
            Index index = (Index) msg;
            System.out.println(index);
        } else {
            unhandled(msg);
        }
    }

}
