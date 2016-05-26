package hahn.learning.akka.spider.actor

import akka.actor.Actor
import hahn.learning.akka.spider.Message

/**
  * Created by jianghan on 16-5-26.
  */
class SaveWebSite extends Actor {

  def receive = {
    case Message.Save(url) => println(s"${url}")
    case _ => println("Error SaveWebSite")
  }

}
