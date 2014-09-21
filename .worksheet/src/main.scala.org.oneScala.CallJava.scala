
package main.scala.org.oneScala
import java.net.InetAddress

object CallJava {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 

		     
	println(Runtime.getRuntime().exec("hostname"));$skip(52); 
  println(InetAddress.getLocalHost().getHostName());$skip(44); 
  println("Welcome to the Scala worksheet");$skip(116); 
  
  
  try {
			throw new Exception("Mock exception");
		} catch {
			case e: Exception => e.printStackTrace()
		}}
		
		
}
