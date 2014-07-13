package com.junius
import scala.collection.immutable.Stream

class Duck {
  def makeDuckNoise() = "gua gua"
}

class Chicken {
  def makeChickenNoise() = "ge ge"
}

class Ducken(chicken: Chicken) extends Duck {
  override def makeDuckNoise() = chicken.makeChickenNoise()
}
class PaClass(childData:Int){}

class TtClass(data : Int) extends PaClass(data){
  def prnt() = {
    println(data)
  }  
}

object myClass {
  private var _interp: Int = _
  def interp = _interp
  def interp_= (i: Int) { _interp = i }

  def main(args: Array[String]) {
	  //if _interp not inited, the value is 0
        println(_interp)
      
      //implict
      //if we want to call a function, the parameter is class a.
      //and a can be constructed from an object of class b.
      //then we can call this function with object of class b if we
       //define a implicit conversion function.
      implicit def chickenToDuck(chicken: Chicken) = new Ducken(chicken)

      def giveMeADuck(duck: Duck) = duck.makeDuckNoise()
      giveMeADuck(new Duck)
      giveMeADuck(new Ducken(new Chicken))
      giveMeADuck(new Chicken)  
      
      val tt = new TtClass(18)
      tt.prnt()
      val res = (0 to 10).scan(0)(_+_)
      
      val a:Stream[Int] = Stream(0,1)
      val it = a.iterator
      while (it.hasNext)
        println(it.next)
        
      lazy val fibs: Stream[Int] = Stream.cons(1, (fibs zip fibs.tail).map(p => p._1 + p._2))
      val list1 : List[Int] = List(1,2,3)
      list1.toStream.append(Stream(4)).toList
      
  }

}