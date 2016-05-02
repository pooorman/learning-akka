package org.hahn.spider.actor;

import akka.actor.UntypedActor;
import org.hahn.spider.message.Save;

/**
 * Created by jianghan on 16/5/2.
 */
public class SaveWebSite extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Save) {
            Save save = (Save) msg;
            System.out.println(save.toString());
        } else {
            unhandled(msg);
        }
    }

}
