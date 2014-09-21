package com.junius
import java.util.Random

object closure {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(170); 
  def a() : () => Any = {
    var x = 1;
  	def b() = {x = x + 1; println("I ma closure ",x)}
  	return b
  };System.out.println("""a: ()() => Any""");$skip(56); 
  //get the internal func b as a closure.
  val f = a();System.out.println("""f  : () => Any = """ + $show(f ));$skip(6); val res$0 = 
  f();System.out.println("""res0: Any = """ + $show(res$0));$skip(6); val res$1 = 
  f();System.out.println("""res1: Any = """ + $show(res$1));$skip(27); 
  val ran = new Random(10);System.out.println("""ran  : java.util.Random = """ + $show(ran ));$skip(51); val res$2 = 
  (0 to 1) map { t =>
  	println(ran.nextInt(100))
  };System.out.println("""res2: scala.collection.immutable.IndexedSeq[Unit] = """ + $show(res$2));$skip(23); 
  
  var sum = 0.0;System.out.println("""sum  : Double = """ + $show(sum ));$skip(30); val res$3 = 
  (0 to 10) map {
  	sum += _
  };System.out.println("""res3: scala.collection.immutable.IndexedSeq[Unit] = """ + $show(res$3));$skip(19); 
  println(sum);$skip(48); 
  
  println("Welcome to the Scala worksheet")}
}
