package oneScala

package fineqtbull.customer

class Publication(val title: String)

class Book(title: String) extends Publication(title)

object Library {

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

trait GetInfoAction[ P >: Book, R <: AnyRef] {

   def apply(book : P) : R
}

object Customer extends Application {

    def getTitle(p: Publication): String = p.title

    Library.printBookList(getTitle)


    Library.printBokkListByTrait(new GetInfoAction[Publication, String] {
            def apply(p: Publication) : String = p.title })
}


trait Function1[-S, +T] {
  def apply(x: S): T
}





