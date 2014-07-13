package main.scala.org.oneScala

import scala.actors._
import scala.actors.Actor._
import scala.math.BigInt
import scala.collection.mutable
import scala.collection.immutable

//can't do it , every func or method should be within object or class.
//def fun35() = {println("hello")}

object HelloWorld {  
   def main(args: Array[String]) { 
      val a = new Array[Int](10)
      val it = a.iterator

      while (it.hasNext)
        println(it.next)     
      
      //val itr: scala.collection.mutable.Iterable[Int] = new LinkedList[Int]()
      //val que1 : mutable.Queue[Int] = new mutable.Queue.empty[Int]
      //can't pass compilation 
      //val itr1: scala.collection.immutable.Iterable[Int] = new LinkedList[Int]()
      //??how to new a immutable queue object.
      //val queue = new immutable.Queue.empty[Int]
      //val hw = new HelloWorld
      //queue.+=("hello")
      
      println("Hello, world!")
   }
}


