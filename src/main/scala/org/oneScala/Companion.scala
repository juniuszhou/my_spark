package main.scala.org.oneScala

import scala.collection.mutable._
import scala.collection.mutable

//in parameter, you can define data member has the same name with parameter
class Publication(val title: String)
class Book(title: String) extends Publication(title)
/*
object Library1{
    val books: Set[Book] =
        Set(
            new Book("Programming in Scala"),
            new Book("Walden")
        )

    def printBookList(info: Book => AnyRef) {
        assert(info.isInstanceOf[Function1[_, _]])
        for (book <- books)
            println(info(book))
    }

    def printBokkListByTrait[P >: Book, R <: AnyRef](
            action : GetInfoAction[P, R]) {
        for (book <- books)
            println(action(book))
    }
}

*/

trait GetInfoAction[ P >: Book, R <: AnyRef] {
   def apply(book : P) : R
}

trait Function1[-S, +T] {
  def apply(x: S): T
}

/*
object temporary {
	def getTitle(p: Publication) = p.title
  def aa = getTitle(new Publication("junius "))
  if (aa.isInstanceOf[Function1[_,_]])
  	println("is ")

    Library1.printBookList(getTitle)

    Library1.printBokkListByTrait(new GetInfoAction[Publication, String] {
           def apply(p: Publication) : String = p.title })
  println("Welcome to the Scala worksheet")
}
*/
object Companion {
  def main(args: Array[String]) { 
  	/*def getTitle(p: Publication) = p.title
  def aa = getTitle(new Publication("junius "))
  if (aa.isInstanceOf[Function1[_,_]])
  	println("is ")

    Library1.printBookList(getTitle)
  def show = println("I am a companion")

  */
    println("I am a companion")
}
}

class Companion {
}