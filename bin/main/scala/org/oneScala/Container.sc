package oneScala
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.collection.mutable._
object Container {
	//def array
	val as : Array[String] = new Array[String](3)
                                                  //> as  : Array[String] = Array(null, null, null)
	as(0) = "Hello "
	as(1) = "World "
	as(2) = "!"
	as(0) = "pass "
	as.foreach(println)                       //> pass 
                                                  //| World 
                                                  //| !
	//list
	val ls = List(1,2)                        //> ls  : List[Int] = List(1, 2)
	val lsNo = Nil                            //> lsNo  : scala.collection.immutable.Nil.type = List()
	val hItem = ls.head                       //> hItem  : Int = 1
	val tItem = ls.tail                       //> tItem  : List[Int] = List(2)
	val ttItem = tItem.tail                   //> ttItem  : List[Int] = List()
	val lsi : List[Int] = List[Int](3,4)      //> lsi  : List[Int] = List(3, 4)
	val ls1 = 1 :: 2 :: Nil                   //> ls1  : List[Int] = List(1, 2)
	val llink = ls ::: lsi                    //> llink  : List[Int] = List(1, 2, 3, 4)
	//from next def, so you have to use :::: to connect to one dimension
	val llink2 = ls :: lsi                    //> llink2  : List[Any] = List(List(1, 2), 3, 4)
	val lsb : List[Int] = List(1,2,3,4,5)     //> lsb  : List[Int] = List(1, 2, 3, 4, 5)
	val rlsb = lsb.reverse                    //> rlsb  : List[Int] = List(5, 4, 3, 2, 1)
	val alsb = 0 :: lsb                       //> alsb  : List[Int] = List(0, 1, 2, 3, 4, 5)
	val ralsb = alsb.reverse                  //> ralsb  : List[Int] = List(5, 4, 3, 2, 1, 0)
	
	//tuple, each element's type could be different
	val t1 = (1,"2")                          //> t1  : (Int, String) = (1,2)
	println(t1._1)                            //> 1
	println(t1._2)                            //> 2
	val t2 : Tuple2[Int,String] = Tuple2[Int,String](1,"2")
                                                  //> t2  : (Int, String) = (1,2)
	
	//set
	val set1 = Set("hello","world")           //> set1  : scala.collection.mutable.Set[String] = Set(world, hello)
	set1 += "!"                               //> res0: oneScala.Container.set1.type = Set(!, world, hello)
	//Iterator it = set1.
	
	//map
	val map1 = Map(1 -> "1")                  //> map1  : scala.collection.mutable.Map[Int,String] = Map(1 -> 1)
	map1 += (2 -> "2")                        //> res1: oneScala.Container.map1.type = Map(2 -> 2, 1 -> 1)
  
  //list buffer
  val llint = List(1,2,3,4)                       //> llint  : List[Int] = List(1, 2, 3, 4)
  val buf = new ListBuffer[Int]                   //> buf  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
  for(x <- llint) buf += x + 1
  buf.toList                                      //> res2: List[Int] = List(2, 3, 4, 5)
  //val buf2 = new Listbuffer(llint)
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}