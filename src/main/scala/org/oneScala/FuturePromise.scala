package main.scala.org.oneScala
import scala.concurrent.Future
import scala.concurrent.Promise
import scala.util.Try
import scala.util.Success
import scala.util.Failure


object FuturePromise {
  def main(args: Array[String]) {

    
    //define a func to return try.
    def res(i:Int) : Try[String] = if (i > 0) Success[String]("sucess") else Failure[String](new Exception)

    List(2,-2) map (i => { res(i) match {
      case Success(_) =>
        println("call is successful")
      case Failure(_) =>
        println("call is failed")
    }})
    
    def res2(str : Try[String]) : Try[String] = str match {
      case Success(_) =>
        println("call is successful")
        Success[String]("sucess")
      case Failure(_) =>
        println("call is failed")
        Failure[String](new Exception)
    }
    
    def strToTry(str : String) : Try[String] = if (str.length() > 2) Success[String]("sucess")
      else Failure[String](new Exception)
    def strToStr(str : String) : String = str
    
    Success[String]("sucess").flatMap(strToTry)
    res2(res(-2))
    res(-2).flatMap(strToTry)
    println(res(-2).map(strToStr))
    
    def resL(i:Int) : Try[List[String]] = if (i > 0) Success[List[String]]("success " :: "success" :: Nil)
      else Failure[List[String]](new Exception)
      
    resL(2) foreach (println _)
    
    
    
    //val f : Future[List[Int]] = Future(List(1,2,3))
    
    //val p = new Promise[List[String]]
    
  }
}