
package main.scala.org.oneScala
import java.net.InetAddress

object CallJava {

		     
	println(Runtime.getRuntime().exec("hostname"))
                                                  //> java.lang.UNIXProcess@6f440a7a
  println(InetAddress.getLocalHost().getHostName())
                                                  //> ubuntu
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  try {
			throw new Exception("Mock exception");
		} catch {
			case e: Exception => e.printStackTrace()
		}                                 //> java.lang.Exception: Mock exception
                                                  //| 	at main.scala.org.oneScala.CallJava$$anonfun$main$1.apply$mcV$sp(main.sc
                                                  //| ala.org.oneScala.CallJava.scala:14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at main.scala.org.oneScala.CallJava$.main(main.scala.org.oneScala.CallJa
                                                  //| va.scala:5)
                                                  //| 	at main.scala.org.oneScala.CallJava.main(main.scala.org.oneScala.CallJav
                                                  //| a.scala)
		
		
}