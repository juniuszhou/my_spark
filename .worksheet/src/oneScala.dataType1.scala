package oneScala
//Rich type equal to java Integer and so on.
import scala.runtime.{RichInt,RichLong,RichByte,RichShort,RichChar,RichFloat,RichDouble,RichBoolean}

object dataType1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(199); 
  val a:Byte = 0;System.out.println("""a  : Byte = """ + $show(a ));$skip(18); 
  val b:Short = 0;System.out.println("""b  : Short = """ + $show(b ));$skip(18); 
  val c:Long = 0L;System.out.println("""c  : Long = """ + $show(c ));$skip(58); 
  // length of char is 16 same with java
  val d:Char = 0;System.out.println("""d  : Char = """ + $show(d ));$skip(59); 
  //add postfix F we can define Float
  val e:Float = 0.1F;System.out.println("""e  : Float = """ + $show(e ));$skip(15); 
	val i:Int = 9;System.out.println("""i  : Int = """ + $show(i ));$skip(20); 
	val j:Double = 0.1;System.out.println("""j  : Double = """ + $show(j ));$skip(24); 
	val k:String = "hello";System.out.println("""k  : String = """ + $show(k ));$skip(22); 
	val l:Boolean = true;System.out.println("""l  : Boolean = """ + $show(l ));$skip(39); 
	
	//top layer classes
	val m:Any = "";System.out.println("""m  : Any = """ + $show(m ));$skip(18); 
	val n:AnyVal = 1;System.out.println("""n  : AnyVal = """ + $show(n ));$skip(19); 
	val o:AnyRef = "";System.out.println("""o  : AnyRef = """ + $show(o ));$skip(48); 
	
	//Unit is like void in java
	val p:Unit = ();System.out.println("""p  : Unit = """ + $show(p ));$skip(98); 
	//func return last item in default except we explicit no return value.
	def fUnit() : Unit = {1};System.out.println("""fUnit: ()Unit""");$skip(18); 
	println(fUnit());$skip(14); 
	val r = null;System.out.println("""r  : Null = """ + $show(r ));$skip(184); 
	
	//special type is Nothing, we can't define variable for it, just use the type
	//to indicate something abnormal
	def error() : Nothing = throw new RuntimeException("Hello Nothing");System.out.println("""error: ()Nothing""");$skip(17); 
	
	var index = 0;System.out.println("""index  : Int = """ + $show(index ));$skip(103); 
	//while
	while (index <= i){
		print(index)
		//if
		if (index < i) print(",")
		index = index + 1
	};$skip(67); 
	//foreach
	val as:Array[String] = Array[String]("hello","world");System.out.println("""as  : Array[String] = """ + $show(as ));$skip(41); ;
  //compact format
  as.foreach(println);$skip(61); 
	//formal format
  as.foreach((arg: String) => println(arg));$skip(38); 
  //for
  for(arg <- as) println(arg);$skip(30); 
  for(i <- 0 to 3) println(i);$skip(31); 
  //bit operation
  val a1 = 1;System.out.println("""a1  : Int = """ + $show(a1 ));$skip(13); 
  val b1 = 2;System.out.println("""b1  : Int = """ + $show(b1 ));$skip(10); val res$0 = 
  a1 & b1;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  a1 | b1;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  a1 ^ b1;System.out.println("""res2: Int = """ + $show(res$2));$skip(6); val res$3 = 
  ~a1;System.out.println("""res3: Int = """ + $show(res$3));$skip(77); val res$4 = 
  //right shift with sign, left shift and right shift without sign
  a1 >> 2;System.out.println("""res4: Int = """ + $show(res$4));$skip(10); val res$5 = 
  a1 << 2;System.out.println("""res5: Int = """ + $show(res$5));$skip(11); val res$6 = 
  a1 >>> 2;System.out.println("""res6: Int = """ + $show(res$6));$skip(285); 
  
  //compare two objects ==, == implementation is scala like scala check if left object is null
  // then return false, otherwise call left object's equal method.
  
  //scala also provide eq and ne for object can be mapped to java.
  
  
  println("Welcome to the Scala worksheet")}
}
