package com.junius

class x{}
class pAdd[A <% Int] {
	def addP(x:A) = x+x
}

class y extends x{
val i:Int = 0
}
class y2 extends x{}

class z[+T]{}

object genericClass {
def a(p : z[x]) = {println("hello");}             //> a: (p: com.junius.z[com.junius.x])Unit
  val pp : z[x] = new z[y2]()                     //> pp  : com.junius.z[com.junius.x] = com.junius.z@2083d
  a(pp)                                           //> hello
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	implicit def strToInt(s : String) = {
		println("hello");
		s.toInt
	}                                         //> strToInt: (s: String)Int
	//val i:Int = "123"
	(new pAdd[String]).addP("123")            //> hello
                                                  //| hello
                                                  //| res0: Int = 246
}

object aaa{
	def main(args : Array[String]){

	}
}