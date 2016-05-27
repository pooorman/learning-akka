package hahn.learning.akka.spider

import java.util.concurrent.TimeUnit

import akka.actor.{ActorRef, ActorSystem, Props}
import hahn.learning.akka.spider.actor.{ExtractContent, FetchUrl}

import scala.concurrent.Await
import scala.concurrent.duration.Duration

/**
  * Created by jianghan on 16-5-26.
  */

object Main extends App {

  val system = ActorSystem.create("SpiderTest")

  val fetch = system.actorOf(Props.create(classOf[FetchUrl]), "fetch")
  val extractContent = system.actorOf(Props.create(classOf[ExtractContent]), "extract")
  // val buildIndex = system.actorOf(Props.create(classOf[BuildIndex]), "build")
  fetch.tell(new Message.Fetch("http://www.baidu.com/", 0), ActorRef.noSender)

  Thread.sleep(10000)
  Await.result(system.terminate, Duration.apply(10, TimeUnit.SECONDS))
  println("END Actor")

}
