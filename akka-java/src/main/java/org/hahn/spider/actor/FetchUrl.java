package org.hahn.spider.actor;

import akka.actor.UntypedActor;
import org.hahn.spider.message.Extract;
import org.hahn.spider.message.Fetch;

/**
 * Created by jianghan on 16/5/2.
 */
public class FetchUrl extends UntypedActor {

    @Override
    public void preStart() throws Exception {
    }

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Fetch) {
            Fetch fetch = (Fetch) msg;
            System.out.println(fetch.toString());
            getContext().actorSelection("/user/extract").tell(new Extract(fetch.getUrl(), new byte[0]), getSelf());
            // getSelf().tell(new Extract(fetch.getUrl(), new byte[0]), getSelf());
            // getSender().tell(new Extract(fetch.getUrl(), new byte[0]), getSelf());
            // getSender().tell(new Save(fetch.getUrl()), getSelf());
        } else {
            unhandled(msg);
        }
    }

}
