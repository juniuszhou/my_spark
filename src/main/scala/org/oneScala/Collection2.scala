package main.scala.org.oneScala
import scala.collection.mutable.Map

class foo{
  def apply() = println("foo apply")
  def printOK = println("OK")
}

object fooMaker{
	def apply() = new foo
}

object Collection2 {
	def main(args : Array[String]){
	  val map1 = Map(1 -> 1, 2 ->2)
	  var map2 = Map(3 -> 3)
	  map2 = map1 ++ map2
	  println(map1(1))
	  val it = (map1 ++ map2).iterator
	  while (it.hasNext){
	    println(it.next)
	  }

	  //println(map1(3))
	  println(map1.get(3).isDefined)
	  
	  map1.get(3) match {
	    case Some(_) => println("")
	    case None =>  println("")
	  }
	  
	  def one : PartialFunction[Int, Unit] = { case 1 => println("I am one") }
	  one(1)
	  
	  val alist = (0 to 10)
	  println(alist.foldLeft(99)((m,n) => m + n))
	  
	  //compose andThen just for func with same signature.
	  def f1(u:String) = {println("hello"); "hello"}
	  def f2(j:String) = {println("world"); "world"}
	  val f1f2 = f1 _ compose f2 _ 
	  val f2f1 = f1 _ andThen f2 _
	  f1f2("ok")
	  f2f1("ok")
	  
	  //anonymous function
	  val f3 = (i:Int,j:Int) => i+j
	  f3(1,2)
	  
	  def multi(i:Int)(j:Int) = i*j
	  def multi2(k:Int) = multi(k) _
	  println(multi2(100)(9))
	  
	  //apply usage
	  val foo1 = fooMaker()
	  foo1.printOK
	  foo1()
	  
	}
}