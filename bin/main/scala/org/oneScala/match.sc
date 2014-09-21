package oneScala

case class MyMatch(a: String, b: String){
  def this(a: String) = this(a, "nothing")
}

object match1 {
  println("Welcome to the Scala worksheet")
  val str2 = "apple"
  str2 match {
  	case "apple" => println("I am apple")
  }
  
  val ls = 1 :: Nil
  //just match one then exit from match statement.
  ls match {
  	case Nil => println("List is empty")
  	case 1 :: Nil => println("List include 1")
  	case head :: tail => println(head)
  }
  
  //value match
  val a: Int = 0
  val b: Int = 9
  a match{
    case 0 => println(0)
    case 1 => println(1)
    //variable match
    case b => println(b)
    case _ => println(99)
  }
  
  //constructor match
  val mm: MyMatch = new MyMatch("helo", "world")
  mm match{
    case MyMatch("hello", "world") => println(0)
    //case MyMatch("helo") => println(1)
    case _ => println(99)
  }
  
  //serial match
  val aList = List(0,1,2)
  aList match{
    case List(1,2,3) => println(0)
    case List(0,1,_) => println(1)
    case _ => println(99)
  }
  
  //tuple match
  val aTuple: Any = (0,1,2)
  aTuple match{
    case (a: Int,b: Int) => println(0)
    case (a,b,c) => println(1)
    case _ => println(99)
  }
  
  //type match
  def mathType(x: Any) = x match{
    case s: String => println(s)
    case m: Map[_, _] => println("map")
    case _ => println(99)
  }
  
  def main(args: Array[String]) {
  }
}