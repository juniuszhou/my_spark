package com.junius
import scala.collection.immutable.List
import scala.util.{Try, Success, Failure}
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

case class otherSub extends otherClass2{  
}

abstract class otherClass2(){
  println("Hello world")
  def apply() = println("Hello otherClass")
  def getOr() = try this match {
    case otherSub() =>  println("Hello try else")
  	}  	
 }

class otherClass(val a:Int, var b:Int) {
  println("Hello world")
  def apply() = println("Hello otherClass")
 }

object otherClass {
  
  def main(args: Array[String]) {
	
	  def g(f :  Int => Int)(x: Int) : Int = f(x) 
    
	 def f1(i: Int): Try[Int] = {
	   if ( i > 0) return Success(i)
	   else throw new Exception()
	 } 
	 
	 
	 def f2(f: Int => Try[Int])(x : Int) : Int = {
	   f(x) match {	 
	   case Success(x) => x
	   case Failure(x) => -1
	   }
	 }
	 
	 val fff = f2(f1)(9)
	
	 val otherSub1 = new otherSub
	 otherSub1.getOr()
	 
	 //how to use future, non block method. it is implemented via other thread.
	 def a(i: Int): Future[Int] = Future {
	   Thread.sleep(1000)
	   if ( i > 0 ) { 
	     println("not good")
	     2
	   }
	   else {
	     println("not good")
	     3
	   }	   
	 }
	 a(9) onComplete {
	   case Success(v) => println(v)
	   case Failure(v) => println(v)
	 }
	 
	 a(9) onSuccess {
	   case bs => println(bs)
	 }
	 a(9) onFailure {
	   case bs => println(bs)
	 }
	 
	 println("I am faster")
	 
	 Thread.sleep(5000)
	 println("over") 
	 
	 
  } 

}