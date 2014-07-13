package main.scala.org.oneScala
class a1{}
class b1 extends a1{}
/*
 * variance 是一个class和另外一个class之间是否存在这种parent和child之间的关系，
 * 如果class的模板参数之间有parent和child之间的关系。
 */
//define variance and de variance classes.
class c1[+T](t:T){}
class c2[-T](t:T){}
//covariance can work together with bounds.
class c3[+T >: b1 <: a1](t:T){}
//trait is similar with class. both can be used.
trait c4[+T >: b1 <: a1]{}

//class c4[T :> a1](){}

object wrapper{
	//in method, you can use the bound, but covariance not supported
	def f1[T >: b1 <: a1]() {}
	//
	//def f2[+T](t:T){}
}

object bound {
	def main(args: Array[String]) { 
	}
}