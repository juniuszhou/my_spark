package com.junius
import java.util.Random

object closure {
  def a() : () => Any = {
    var x = 1;
  	def b() = {x = x + 1; println("I ma closure ",x)}
  	return b
  }                                               //> a: ()() => Any
  //get the internal func b as a closure.
  val f = a()                                     //> f  : () => Any = <function0>
  f()                                             //> (I ma closure ,2)
                                                  //| res0: Any = ()
  f()                                             //> (I ma closure ,3)
                                                  //| res1: Any = ()
  val ran = new Random(10)                        //> ran  : java.util.Random = java.util.Random@62787c64
  (0 to 1) map { t =>
  	println(ran.nextInt(100))                 //> 13
                                                  //| 80
                                                  //| res2: scala.collection.immutable.IndexedSeq[Unit] = Vector((), ())
  }
  
  var sum = 0.0                                   //> sum  : Double = 0.0
  (0 to 10) map {
  	sum += _                                  //> res3: scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), (), (
                                                  //| ), (), (), (), (), (), ())
  }
  println(sum)                                    //> 55.0
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}