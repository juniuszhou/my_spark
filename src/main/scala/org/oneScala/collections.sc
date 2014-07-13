package com.junius

object collections {
  val ran : Range = 1 to 10                       //> ran  : Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val ran2 : Range = 1 until 10                   //> ran2  : Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
  //zip will choose the shorter one, discard the extra elements
  
  val pairs = ran zip ran2                        //> pairs  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (
                                                  //| 2,2), (3,3), (4,4), (5,5), (6,6), (7,7), (8,8), (9,9))
  (1 to 5) flatMap (x => (1 to 4) map (y => (x,y)))
                                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (2,1), (2,2), (2,3), (2,4), (3,1), (3,2), (3,3), (3,4), (4,
                                                  //| 1), (4,2), (4,3), (4,4), (5,1), (5,2), (5,3), (5,4))
  
  def isPrime(n: Int) : Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  println(isPrime(7),isPrime(27))                 //> (true,false)
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var a = 1                                       //> a  : Int = 1
  def getA() = {println(a);a}                     //> getA: ()Int
  
  println(getA())                                 //> 1
                                                  //| 1
  a = 3
  println(getA())                                 //> 3
                                                  //| 3
    //get the mapping value or return we
    val num = collection.mutable.Map(1 ->2)       //> num  : scala.collection.mutable.Map[Int,Int] = Map(1 -> 2)
    println(num.getOrElseUpdate(1, 3))            //> 2
    println(num)                                  //> Map(1 -> 2)
    //sugar for two value tuple.
    "a" -> 2                                      //> res1: (String, Int) = (a,2)
  
  val arr : Array[Int] = List(1,2,3).toArray      //> arr  : Array[Int] = Array(1, 2, 3)

  arr.scanLeft(0L)(_ + _)                         //> res2: Array[Long] = Array(0, 1, 3, 6)
    
}