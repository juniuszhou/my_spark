package oneScala

import scala.math.BigInt

trait aa{}
class bb(a: String){
  //if a method without any parameter, it is better not defind the (). then
  //it seems unified for access to a data member and a method. recommended by scala.
  def getLen: Int = return 0
  var name: String = null
  //
  def setName(_name: String): this.type = {
    name = _name
    this
  }
}
//call parent class constructor
class cc(a: String) extends bb(a){
}

object classes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val bb1 = new bb("hello")                       //> bb1  : oneScala.bb = oneScala.bb@182bbd37
  //bb1.type
  
  class Interlog() extends aa
	
	val log = new Interlog                    //> log  : oneScala.classes.Interlog = oneScala.classes$$anonfun$main$1$Interlog
                                                  //| $1@6ae006d8
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
                                                  //| 1@52f0684e
  m1.var1 = 1
  //class and its data member
  class data{
  	val a = 0
  	var b : Float  = _ //default constructor
  }
  val d1 = new data                               //> d1  : oneScala.classes.data = oneScala.classes$$anonfun$main$1$data$1@624a24
                                                  //| 0d
  var d2 = new data                               //> d2  : oneScala.classes.data = oneScala.classes$$anonfun$main$1$data$1@718503
                                                  //| e4
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