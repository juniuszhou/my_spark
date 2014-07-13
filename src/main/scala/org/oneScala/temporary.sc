package my.library

import scala.collection.mutable._


//in parameter, you can define data member has the same name with parameter
class Publication(val title: String)
class Book(title: String) extends Publication(title)

object Library1{
    val books: Set[Book] =
        Set(
            new Book("Programming in Scala"),
            new Book("Walden")
        )                                         //> books  : scala.collection.mutable.Set[my.library.Book] = Set(my.library.Book
                                                  //| @477b4e, my.library.Book@f0691c)

    def printBookList(info: Book => AnyRef) {
        assert(info.isInstanceOf[Function1[_, _]])
        for (book <- books)
            println(info(book))
    }                                             //> printBookList: (info: my.library.Book => AnyRef)Unit

    def printBokkListByTrait[P >: Book, R <: AnyRef](
            action : GetInfoAction[P, R]) {
        for (book <- books)
            println(action(book))
    }                                             //> printBokkListByTrait: [P >: my.library.Book, R <: AnyRef](action: my.library
                                                  //| .GetInfoAction[P,R])Unit
}



trait GetInfoAction[ P >: Book, R <: AnyRef] {
   def apply(book : P) : R
}

trait Function1[-S, +T] {
  def apply(x: S): T
}

object temporary {
	def getTitle(p: Publication) = p.title
  def aa = getTitle(new Publication("junius "))
  if (aa.isInstanceOf[Function1[_,_]])
  	println("is ")

    //Library1.printBookList(getTitle)

    //Library1.printBokkListByTrait(new GetInfoAction[Publication, String] {
    //        def apply(p: Publication) : String = p.title })
  println("Welcome to the Scala worksheet")
}