package oneScala
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.collection.mutable._

//import scala.collection.immutable.Set
//import scala.collection.immutable.Map


object Container {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(284); 
	//def array
	val as : Array[String] = new Array[String](3);System.out.println("""as  : Array[String] = """ + $show(as ));$skip(18); 
	as(0) = "Hello ";$skip(18); 
	as(1) = "World ";$skip(13); 
	as(2) = "!";$skip(17); 
	as(0) = "pass ";$skip(21); 
	as.foreach(println);$skip(115); 
	//list, implemented as uni direction tree.
	// each item in array and list has the same type.
	val ls = List(1,2);System.out.println("""ls  : List[Int] = """ + $show(ls ));$skip(16); 
	val lsNo = Nil;System.out.println("""lsNo  : scala.collection.immutable.Nil.type = """ + $show(lsNo ));$skip(21); 
	val hItem = ls.head;System.out.println("""hItem  : Int = """ + $show(hItem ));$skip(21); 
	val tItem = ls.tail;System.out.println("""tItem  : List[Int] = """ + $show(tItem ));$skip(25); 
	val ttItem = tItem.tail;System.out.println("""ttItem  : List[Int] = """ + $show(ttItem ));$skip(38); 
	val lsi : List[Int] = List[Int](3,4);System.out.println("""lsi  : List[Int] = """ + $show(lsi ));$skip(25); 
	val ls1 = 1 :: 2 :: Nil;System.out.println("""ls1  : List[Int] = """ + $show(ls1 ));$skip(24); 
	val llink = ls ::: lsi;System.out.println("""llink  : List[Int] = """ + $show(llink ));$skip(94); 
	//from next def, so you have to use :::: to connect to one dimension
	val llink2 = ls :: lsi;System.out.println("""llink2  : List[Any] = """ + $show(llink2 ));$skip(39); 
	val lsb : List[Int] = List(1,2,3,4,5);System.out.println("""lsb  : List[Int] = """ + $show(lsb ));$skip(24); 
	val rlsb = lsb.reverse;System.out.println("""rlsb  : List[Int] = """ + $show(rlsb ));$skip(21); 
	val alsb = 0 :: lsb;System.out.println("""alsb  : List[Int] = """ + $show(alsb ));$skip(26); 
	val ralsb = alsb.reverse;System.out.println("""ralsb  : List[Int] = """ + $show(ralsb ));$skip(69); 
	
	//tuple, each element's type could be different
	val t1 = (1,"2");System.out.println("""t1  : (Int, String) = """ + $show(t1 ));$skip(16); 
	println(t1._1);$skip(16); 
	println(t1._2);$skip(57); 
	val t2 : Tuple2[Int,String] = Tuple2[Int,String](1,"2");System.out.println("""t2  : (Int, String) = """ + $show(t2 ));$skip(42); 
	
	//set
	val set1 = Set("hello","world");System.out.println("""set1  : scala.collection.mutable.Set[String] = """ + $show(set1 ));$skip(13); val res$0 = 
	set1 += "!";System.out.println("""res0: oneScala.Container.set1.type = """ + $show(res$0));$skip(58); 
	//Iterator it = set1.
	
	//map
	val map1 = Map(1 -> "1");System.out.println("""map1  : scala.collection.mutable.Map[Int,String] = """ + $show(map1 ));$skip(20); val res$1 = 
	map1 += (2 -> "2");System.out.println("""res1: oneScala.Container.map1.type = """ + $show(res$1));$skip(47); 
  
  //list buffer
  val llint = List(1,2,3,4);System.out.println("""llint  : List[Int] = """ + $show(llint ));$skip(32); 
  val buf = new ListBuffer[Int];System.out.println("""buf  : scala.collection.mutable.ListBuffer[Int] = """ + $show(buf ));$skip(31); 
  for(x <- llint) buf += x + 1;$skip(13); val res$2 = 
  buf.toList;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(84); 
  //val buf2 = new Listbuffer(llint)
  
  println("Welcome to the Scala worksheet")}
}
