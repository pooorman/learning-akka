package hahn.learning.akka.spider

/**
  * Created by jianghan on 16-5-26.
  */
object Message {

  case class Extract(val url: String, val content: Array[Byte])

  case class Fetch(val url: String, val tryNum: Int)

  case class Index(val indexType: String, val url: String, val title: String, val content: String)

  case class Save(val url: String)

}
