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

object classes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(503); 
  println("Welcome to the Scala worksheet");$skip(28); 
  val bb1 = new bb("hello")
  //bb1.type
  
  class Interlog() extends aa;System.out.println("""bb1  : oneScala.bb = """ + $show(bb1 ));$skip(72); 
	
	val log = new Interlog
//constructors
  class multiCon(p : Int){
  	//other constructor
  	def this(p1 : Int, p2 : Int) = {
  		this(p1 + p2)
  	}
  	val val1 = 0
  	var var1 = 0
  	
  };System.out.println("""log  : oneScala.classes.Interlog = """ + $show(log ));$skip(196); 
  
  val m1 = new multiCon(1,2);System.out.println("""m1  : oneScala.classes.multiCon = """ + $show(m1 ));$skip(14); 
  m1.var1 = 1
  //class and its data member
  class data{
  	val a = 0
  	var b : Float  = _ //default constructor
  };$skip(125); 
  val d1 = new data;System.out.println("""d1  : oneScala.classes.data = """ + $show(d1 ));$skip(20); 
  var d2 = new data
  //defautl get/set method for public var variable.
  class data2{
  	var a = 0
  };System.out.println("""d2  : oneScala.classes.data = """ + $show(d2 ));$skip(110); 

  println((new data2).a);$skip(21); 
  (new data2).a_=(1)
 
//object and class
	object com{
		def high = println("hello high")
	}
	
	class com{
		def refhigh = com.high
	};$skip(133); 
	
	def c = new com;System.out.println("""c: => oneScala.classes.com""");$skip(11); 
	c.refhigh}

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
