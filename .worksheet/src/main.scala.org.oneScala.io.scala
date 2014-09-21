package main.scala.org.oneScala

import scala.io.Source

object io {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(184); 
  val lines = Source.fromFile("/home/junius/git_hub/scala/oneScala/src/main/scala/org/oneScala/one.scala").getLines;System.out.println("""lines  : Iterator[String] = """ + $show(lines ));$skip(25); 
  lines.foreach(println);$skip(47); 
  
  println("Welcome to the Scala worksheet")}
}
