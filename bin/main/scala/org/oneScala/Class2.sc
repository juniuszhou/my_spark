package main.scala.org.oneScala

class Time {
  private[this] var h = 12
  private[this] var m = 12
  
  //getter
  def hour: Int = h
  // note, this format should be hour_= , hour_ = not valid.
  //setter
  def hour_= (x: Int) { require(x < 24)
  	h = x}
  
}

trait Queue[+T]{
  def head: T
  
}

object Class2 {
  val tm = new Time                               //> tm  : main.scala.org.oneScala.Time = main.scala.org.oneScala.Time@38f42ac9
  println(tm.hour)                                //> 12
  tm.hour = 18
  println(tm.hour)                                //> 18
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}