package oneScala

case class MyMatch(a: String, b: String){
  def this(a: String) = this(a, "nothing")
}

object match1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(165); 
  println("Welcome to the Scala worksheet");$skip(21); 
  val str2 = "apple";System.out.println("""str2  : String = """ + $show(str2 ));$skip(60); 
  str2 match {
  	case "apple" => println("I am apple")
  };$skip(23); 
  
  val ls = 1 :: Nil;System.out.println("""ls  : List[Int] = """ + $show(ls ));$skip(192); 
  //just match one then exit from match statement.
  ls match {
  	case Nil => println("List is empty")
  	case 1 :: Nil => println("List include 1")
  	case head :: tail => println(head)
  };$skip(36); 
  
  //value match
  val a: Int = 0;System.out.println("""a  : Int = """ + $show(a ));$skip(17); 
  val b: Int = 9;System.out.println("""b  : Int = """ + $show(b ));$skip(137); 
  a match{
    case 0 => println(0)
    case 1 => println(1)
    //variable match
    case b => println(b)
    case _ => println(99)
  };$skip(74); 
  
  //constructor match
  val mm: MyMatch = new MyMatch("helo", "world");System.out.println("""mm  : oneScala.MyMatch = """ + $show(mm ));$skip(132); 
  mm match{
    case MyMatch("hello", "world") => println(0)
    //case MyMatch("helo") => println(1)
    case _ => println(99)
  };$skip(46); 
  
  //serial match
  val aList = List(0,1,2);System.out.println("""aList  : List[Int] = """ + $show(aList ));$skip(115); 
  aList match{
    case List(1,2,3) => println(0)
    case List(0,1,_) => println(1)
    case _ => println(99)
  };$skip(47); 
  
  //tuple match
  val aTuple: Any = (0,1,2);System.out.println("""aTuple  : Any = """ + $show(aTuple ));$skip(116); 
  aTuple match{
    case (a: Int,b: Int) => println(0)
    case (a,b,c) => println(1)
    case _ => println(99)
  }}
  
  
}
