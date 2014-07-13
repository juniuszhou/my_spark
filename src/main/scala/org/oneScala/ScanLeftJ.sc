package com.junius
import scala.math.BigInt

object ScanLeftJ {
  //you can see default scan is scan left
  val res = (1 to 10).scanLeft(0)(_ + _)          //> res  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 3, 6, 10, 1
                                                  //| 5, 21, 28, 36, 45, 55)
  val res2 = (1 to 10).scanRight(0)(_+_)          //> res2  : scala.collection.immutable.IndexedSeq[Int] = Vector(55, 54, 52, 49, 
                                                  //| 45, 40, 34, 27, 19, 10, 0)
  val res3 = (1 to 10).scan(0)(_ + _)             //> res3  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 3, 6, 10, 
                                                  //| 15, 21, 28, 36, 45, 55)
  
  //stream is a lazy list, evaluation just happen when it is necessary.
  lazy val fibs: Stream[Int] = Stream.cons(1, Stream.cons(1, (fibs zip fibs.tail).map(p => p._1 + p._2)))
                                                  //> fibs: => Stream[Int]
  val it = fibs.iterator                          //> it  : Iterator[Int] = non-empty iterator
  //(0 to 10).map( x => println(it.next))
  fibs(10)                                        //> res0: Int = 89
  
  lazy val fib2 : Stream[Int] = 1 #:: 1 #:: (fib2 zip fib2.tail).map(p => p._1 + p._2)
                                                  //> fib2: => Stream[Int]
  val fab3 : Stream[Int] = Stream(1,1)            //> fab3  : Stream[Int] = Stream(1, ?)
  
  (for( i <- (0 to 1) ; j <- (0 to 1)) yield(i * j)).toList
                                                  //> res1: List[Int] = List(0, 0, 0, 1)
  
  val list1 = List(0,1)                           //> list1  : List[Int] = List(0, 1)
  val list2 = List(1,2,3)                         //> list2  : List[Int] = List(1, 2, 3)
  list1 map {x =>
  	list2 map { y => (x+y)}                   //> res2: List[List[Int]] = List(List(1, 2, 3), List(2, 3, 4))
  }
  
  list1 flatMap {x =>
  	list2 map { y => (x+y)}                   //> res3: List[Int] = List(1, 2, 3, 2, 3, 4)
  }
  
  val check : Option[List[Int]] = Some(List(1,2,3))
                                                  //> check  : Option[List[Int]] = Some(List(1, 2, 3))
  check.map(y => { y.map ( x => {println(x) ; x})}).getOrElse {
  }                                               //> 1
                                                  //| 2
                                                  //| 3
                                                  //| res4: Any = List(1, 2, 3)
  
  val check2 : Option[Int] = None                 //> check2  : Option[Int] = None
  check2.map(x => x).getOrElse {
  }                                               //> res5: AnyVal = ()
  
  list1 zip list2                                 //> res6: List[(Int, Int)] = List((0,1), (1,2))
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}