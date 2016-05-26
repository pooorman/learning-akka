package hahn.learning.akka.spider.actor

import akka.actor.Actor
import hahn.learning.akka.spider.Message

/**
  * Created by jianghan on 16-5-26.
  */
class FetchUrl extends Actor {

  def receive = {
    case Message.Fetch(url, tryNum) => println(s"${url}\t${tryNum}")
    case _ => println("Error FetchUrl")
  }

}
