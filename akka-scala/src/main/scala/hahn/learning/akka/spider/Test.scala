package hahn.learning.akka.spider

/**
  * Created by jianghan on 16/6/24.
  */
// sealed trait A

abstract class A

case class B(a: Int) extends A

case class C(a: Int) extends A

case class D(a: Int) extends A


trait Base

final case class SubtypeOne(a: Int) extends Base

final case class SubtypeTwo(b: Option[String]) extends Base

object Test extends App {

  val a: A = B(1)

  a match {
    case e@B(_) => println(e)
    case e@C(_) => println(e)
  }

  (SubtypeOne(1): Base) match {
    case SubtypeOne(a) => println(a + 2)
  }

}
