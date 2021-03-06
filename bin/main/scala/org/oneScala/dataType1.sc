package oneScala
//Rich type equal to java Integer and so on.
import scala.runtime.{RichInt,RichLong,RichByte,RichShort,RichChar,RichFloat,RichDouble,RichBoolean}

object dataType1 {
  val a:Byte = 0                                  //> a  : Byte = 0
  val b:Short = 0                                 //> b  : Short = 0
  val c:Long = 0L                                 //> c  : Long = 0
  // length of char is 16 same with java
  val d:Char = 0                                  //> d  : Char =  
  //add postfix F we can define Float
  val e:Float = 0.1F                              //> e  : Float = 0.1
	val i:Int = 9                             //> i  : Int = 9
	val j:Double = 0.1                        //> j  : Double = 0.1
	val k:String = "hello"                    //> k  : String = hello
	val l:Boolean = true                      //> l  : Boolean = true
	
	//top layer classes
	val m:Any = ""                            //> m  : Any = ""
	val n:AnyVal = 1                          //> n  : AnyVal = 1
	val o:AnyRef = ""                         //> o  : AnyRef = ""
	
	//Unit is like void in java
	val p:Unit = ()                           //> p  : Unit = ()
	//func return last item in default except we explicit no return value.
	def fUnit() : Unit = {1}                  //> fUnit: ()Unit
	println(fUnit())                          //> ()
	val r = null                              //> r  : Null = null
	
	//special type is Nothing, we can't define variable for it, just use the type
	//to indicate something abnormal
	def error() : Nothing = throw new RuntimeException("Hello Nothing")
                                                  //> error: ()Nothing
	
	var index = 0                             //> index  : Int = 0
	//while
	while (index <= i){
		print(index)
		//if
		if (index < i) print(",")
		index = index + 1
	}                                         //> 0,1,2,3,4,5,6,7,8,9
	//foreach
	val as:Array[String] = Array[String]("hello","world");
                                                  //> as  : Array[String] = Array(hello, world)
  //compact format
  as.foreach(println)                             //> hello
                                                  //| world
	//formal format
  as.foreach((arg: String) => println(arg))       //> hello
                                                  //| world
  //for
  for(arg <- as) println(arg)                     //> hello
                                                  //| world
  for(i <- 0 to 3) println(i)                     //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
  //bit operation
  val a1 = 1                                      //> a1  : Int = 1
  val b1 = 2                                      //> b1  : Int = 2
  a1 & b1                                         //> res0: Int = 0
  a1 | b1                                         //> res1: Int = 3
  a1 ^ b1                                         //> res2: Int = 3
  ~a1                                             //> res3: Int = -2
  //right shift with sign, left shift and right shift without sign
  a1 >> 2                                         //> res4: Int = 0
  a1 << 2                                         //> res5: Int = 4
  a1 >>> 2                                        //> res6: Int = 0
  
  //compare two objects ==, == implementation is scala like scala check if left object is null
  // then return false, otherwise call left object's equal method.
  
  //scala also provide eq and ne for object can be mapped to java.
  
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}