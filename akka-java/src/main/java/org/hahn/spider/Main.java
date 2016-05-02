package org.hahn.spider;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;
import org.hahn.spider.actor.BuildIndex;
import org.hahn.spider.actor.ExtractContent;
import org.hahn.spider.actor.FetchUrl;
import org.hahn.spider.message.Fetch;

/**
 * Created by jianghan on 16/5/2.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ActorSystem system = ActorSystem.create("SpiderTest", ConfigFactory.load("spider-app").getConfig("spider"));
        // ActorSystem system = ActorSystem.create("SpiderTest");

        ActorRef fetch = system.actorOf(Props.create(FetchUrl.class), "fetch");
        ActorRef extractContent = system.actorOf(Props.create(ExtractContent.class), "extract");
        ActorRef buildIndex = system.actorOf(Props.create(BuildIndex.class), "build");

        /**Router router = new Router(new RoundRobinRoutingLogic());
         router.addRoutee(fetch);
         router.addRoutee(extractContent);
         router.route(new Fetch("http://www.baidu.com/", 0), ActorRef.noSender());**/

        // Inbox inbox = Inbox.create(system);

        fetch.tell(new Fetch("http://www.baidu.com/", 0), ActorRef.noSender());
        // extractContent.tell(new Extract("http://www.baidu.com/extract", new byte[0]), ActorRef.noSender());
        // inbox.send(fetch, new Fetch("http://", 0));
        // inbox.send(extractContent, new Extract("http://www.baidu.com/extract", new byte[0]));

        Thread.sleep(10000);
        system.shutdown();
    }

}
