package com.junius
class a{}
class b extends a{}
object Extractor {
	val str = "hello world"                   //> str  : String = hello world
	//final case class ::[B](private var hd: B, private[scala] var tl: List[B]) extends List[B] {
  //override def head : B = hd
  
	val alist = new ::[Int](1,List(1,2,3))    //> alist  : scala.collection.immutable.::[Int] = List(1, 1, 2, 3)
	val blist = new ::[Int](1,Nil)            //> blist  : scala.collection.immutable.::[Int] = List(1)
	println(alist)                            //> List(1, 1, 2, 3)
	//you can't get an instance like following, List is abstract class
	//val clist = new List[Int]
	val a1:a = new a                          //> a1  : com.junius.a = com.junius.a@b27bb5
	val dlist = new ::[a](a1,Nil)             //> dlist  : scala.collection.immutable.::[com.junius.a] = List(com.junius.a@b27
                                                  //| bb5)
  //that OK since we have other list List[+T]
  val b1:b = new b                                //> b1  : com.junius.b = com.junius.b@12ecba8
  val elist = new ::[a](b1,Nil)                   //> elist  : scala.collection.immutable.::[com.junius.a] = List(com.junius.b@12e
                                                  //| cba8)
	
	//tuple, immutable
	val triEle = (1,"1",1.0)                  //> triEle  : (Int, String, Double) = (1,1,1.0)
	println(triEle._1,triEle._2,triEle._3)    //> (1,1,1.0)
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}