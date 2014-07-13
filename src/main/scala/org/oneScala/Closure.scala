package main.scala.org.oneScala
import scala.PartialFunction


class Counter{
	type Receive = PartialFunction[Any,Unit]
	def count(n:Int) : PartialFunction[Any,Unit] = {
	  case "" => println(n)	
	  case _ => println(n)	
	}
	
	def receive = count(0)
}

class Closure {

}