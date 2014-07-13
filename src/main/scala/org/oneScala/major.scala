import scala.util.matching.Regex
import scala.Function1

object library{  
}

object Email{
	def apply(u:String,p:String) = u + "@" + p
	//use Option to define a method can return Some or None.
	//Some and None is subclass of Option, this way we can avoid
	//some times function may not necessary to return a value.
	def unapply(str:String): Option[(String,String)] = {
	  println("I am a unapply")
		val parts = str split "@"
		println("I am a unapply", parts(0),parts(1),parts.length)
		if (parts.length >= 2) Some(parts(0),parts(1)) else None
	}
	//other way to define unapply
	//def unapply(str:String) : Boolean = str.toUpperCase == str
	def unapplySeq(str:String): Option[Seq[String]] = {
	  Some(str.split(".").reverse)
	}
}

object major {
  def main(args: Array[String]) { 
  	val a:String = "asdf@adads"
	a match {
  	  //here a will be given as parameter to unapply method is Email
  	  //then returm value will match the format u & p 
  	    case Email("asdf","adads") => println(" a precise ok ")
		case Email(u,p) => println(" a ok ")
		case _ => println(" a is not email box ")
	}
  	
  	//other example about regular expression
  	//val ecimal = new Regex("""(-)?(\d+)(\.\d*)? """.r)
  	val BookExtractorRE = """Book: title=([^,]+),s+authors=(.+)""".r  
  	val MagazineExtractorRE = """Magazine: title=([^,]+),s+issue=(.+)""".r  
  	val catalog = List(    
  	    "Book: title=Programming Scala, authors=Dean Wampler, Alex Payne",    
  	    "Magazine: title=The New Yorker, issue=January 2009",    
  	    "Book: title=War and Peace, authors=Leo Tolstoy",    
  	    "Magazine: title=The Atlantic, issue=February 2009",    
  	    "BadData: text=Who put this here??"  )  
  	for (item <- catalog) {    
  	  item match {      
  	    case BookExtractorRE(title, authors) => 
  	      println("Book " + title + ", written by " + authors)      
  	    case MagazineExtractorRE(title, issue) => 
  	      println("Magazine " + title + ", issue " + issue)      
  	    case entry => println("Unrecognized entry: " + entry)    
  	    }  
  	  }
  	//println(sign,inter,deci)
    println("I am a companion")
 }
}

class major {
	
}