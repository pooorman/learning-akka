package org.hahn.spider.actor;

import akka.actor.UntypedActor;
import org.hahn.spider.message.Extract;
import org.hahn.spider.message.Index;
import org.hahn.spider.message.IndexType;

/**
 * Created by jianghan on 16/5/2.
 */
public class ExtractContent extends UntypedActor {
    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Extract) {
            Extract extract = (Extract) msg;
            System.out.println(extract);
            getContext().actorSelection("/user/build").tell(new Index(IndexType.Solr, extract.getUrl(), "title", "content"), getSelf());
            // getSender().tell(new Index(IndexType.Solr, extract.getUrl(), "title", "content"), getSelf());
            // getSender().tell(new Index(IndexType.Titan, extract.getUrl(), "title", "content"), getSelf());
        } else {
            unhandled(msg);
        }
    }
}
