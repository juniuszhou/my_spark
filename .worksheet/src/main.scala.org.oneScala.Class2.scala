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

object Class2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(334); 
  val tm = new Time;System.out.println("""tm  : main.scala.org.oneScala.Time = """ + $show(tm ));$skip(19); 
  println(tm.hour);$skip(15); 
  tm.hour = 18;$skip(19); 
  println(tm.hour);$skip(47); 
  
  println("Welcome to the Scala worksheet")}
}
