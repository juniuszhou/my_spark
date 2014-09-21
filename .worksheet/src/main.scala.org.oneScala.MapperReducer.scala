package main.scala.org.oneScala

object MapperReducer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(178); 
  def mapRed(mapper: Int => Int, reducer: (Int, Int) => Int, unit: Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else (mapper(a) + mapRed(mapper, reducer, unit)(a+1,b))
  };System.out.println("""mapRed: (mapper: Int => Int, reducer: (Int, Int) => Int, unit: Int)(a: Int, b: Int)Int""");$skip(41); val res$0 = 
  mapRed(x => x, (y,z) => y + z, 0)(1,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(45); val res$1 = 
  mapRed(x => x * x, (y,z) => y + z, 0)(1,5);System.out.println("""res1: Int = """ + $show(res$1))}
}
