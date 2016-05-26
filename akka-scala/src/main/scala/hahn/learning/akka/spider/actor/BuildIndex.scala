package hahn.learning.akka.spider.actor

import akka.actor.Actor
import hahn.learning.akka.spider.Message

/**
  * Created by jianghan on 16-5-26.
  */
class BuildIndex extends Actor {

  def receive = {
    case Message.Index(t, url, title, content) => println(s"${t}\t${url}\t${title}\t${content}")
    case _ => println("ERROR BuildIndex")
  }

}
