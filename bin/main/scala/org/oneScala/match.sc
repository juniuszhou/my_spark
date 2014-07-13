package oneScala

object match1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val str2 = "apple"                              //> str2  : String = apple
  str2 match {
  	case "apple" => println("I am apple")
  }                                               //> I am apple
  
  val ls = 1 :: Nil                               //> ls  : List[Int] = List(1)
  //just match one then exit from match statement.
  ls match {
  	case Nil => println("List is empty")
  	case 1 :: Nil => println("List include 1")
  	case head :: tail => println(head)
  }                                               //> List include 1
}