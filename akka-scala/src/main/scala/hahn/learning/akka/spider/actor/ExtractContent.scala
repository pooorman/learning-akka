package hahn.learning.akka.spider.actor

import akka.actor.Actor
import hahn.learning.akka.spider.Message

/**
  * Created by jianghan on 16-5-26.
  */
class ExtractContent extends Actor {

  def receive = {
    case Message.Extract(url, content) => println(s"${url}\t${content.length}")
    case _ => println("Error ExtractContent")
  }

}
