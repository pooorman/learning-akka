package hahn.learning.akka.spider.actor

import akka.actor.{Actor, Props}
import hahn.learning.akka.spider.Message

/**
  * Created by jianghan on 16-5-26.
  */
class FetchUrl extends Actor {

  // val child = context.actorOf(Props[ExtractContent], name = "extract")

  def receive = {
    case Message.Fetch(url, tryNum) => {
      println(s"Fetch: ${url}\t${tryNum}")
      context.actorSelection("/user/extract") ! Message.Extract(url, Array[Byte]())
      // sender ! Message.Extract(url, Array[Byte]())
      // child ! Message.Extract(url, Array[Byte]())
      if (tryNum < 3) {
        self ! Message.Fetch(url, tryNum + 1)
      }
    }
    case _ => println("Error FetchUrl")
  }

}
