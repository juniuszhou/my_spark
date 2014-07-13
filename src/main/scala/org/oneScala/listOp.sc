package com.junius

import scala.reflect.ClassTag

//here K <% represent a boundary,   or <:
class BoundedClass[K <% Ordered[K]: ClassTag, V](){}

class abc {
//[junius] means this func is private but accessible in this package.
//so you can call it in listOp
private[junius] def ab() = {}



}

object listOp {
	val rp = new BoundedClass[Int,String]()   //> rp  : com.junius.BoundedClass[Int,String] = com.junius.BoundedClass@1282707
                                                  //| 
	
	val a11 = new abc                         //> a11  : com.junius.abc = com.junius.abc@8777c
	a11.ab()
	val a = List("welcome","to","the","scala")//> a  : List[String] = List(welcome, to, the, scala)
	val b = a.map(_.toString.toList)          //> b  : List[List[Char]] = List(List(w, e, l, c, o, m, e), List(t, o), List(t, 
                                                  //| h, e), List(s, c, a, l, a))
  //flat the multidimension to one dimension
	a.flatMap(_.toList)                       //> res0: List[Char] = List(w, e, l, c, o, m, e, t, o, t, h, e, s, c, a, l, a)
	def alwaysTrue(x:String) : Boolean = true //> alwaysTrue: (x: String)Boolean
  a.filter(alwaysTrue)                            //> res1: List[String] = List(welcome, to, the, scala)
  
  for (i <- a )
  	println(i)                                //> welcome
                                                  //| to
                                                  //| the
                                                  //| scala
  for(i<-a;  j = i; if (i != "the"))
  	println(j)                                //> welcome
                                                  //| to
                                                  //| scala
  	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}