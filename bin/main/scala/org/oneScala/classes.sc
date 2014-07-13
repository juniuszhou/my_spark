package oneScala

import scala.math.BigInt

trait aa{}
class bb{}



object classes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Interlog() extends aa
	
	val log = new Interlog                    //> log  : oneScala.classes.Interlog = oneScala.classes$$anonfun$main$1$Interlog
                                                  //| $1@1364b53
//constructors
  class multiCon(p : Int){
  	//other constructor
  	def this(p1 : Int, p2 : Int) = {
  		this(p1 + p2)
  	}
  	val val1 = 0
  	var var1 = 0
  	
  }
  
  val m1 = new multiCon(1,2)                      //> m1  : oneScala.classes.multiCon = oneScala.classes$$anonfun$main$1$multiCon$
                                                  //| 1@c44cfb
  m1.var1 = 1
  //class and its data member
  class data{
  	val a = 0
  	var b : Float  = _ //default constructor
  }
  val d1 = new data                               //> d1  : oneScala.classes.data = oneScala.classes$$anonfun$main$1$data$1@f82fe7
                                                  //| 
  var d2 = new data                               //> d2  : oneScala.classes.data = oneScala.classes$$anonfun$main$1$data$1@111f9b
                                                  //| 
  //defautl get/set method for public var variable.
  class data2{
  	var a = 0
  }

  println((new data2).a)                          //> 0
  (new data2).a_=(1)
 
//object and class
	object com{
		def high = println("hello high")
	}
	
	class com{
		def refhigh = com.high
	}
	
	def c = new com                           //> c: => oneScala.classes.com
	c.refhigh                                 //> hello high

//class and trait
  trait t1{
  	def a = println("")
  }
  abstract class a1{
  }
  class child extends t1{
  override def a = println("child ")
  }
 
}