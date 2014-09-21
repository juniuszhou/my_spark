package main.scala.org.oneScala

object MapperReducer {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def mapRed(mapper: Int => Int, reducer: (Int, Int) => Int, unit: Int)(a: Int, b: Int): Int = {
    if (a > b) 0
    else (mapper(a) + mapRed(mapper, reducer, unit)(a+1,b))
  }                                               //> mapRed: (mapper: Int => Int, reducer: (Int, Int) => Int, unit: Int)(a: Int, 
                                                  //| b: Int)Int
  mapRed(x => x, (y,z) => y + z, 0)(1,5)          //> res0: Int = 15
  mapRed(x => x * x, (y,z) => y + z, 0)(1,5)      //> res1: Int = 55
}