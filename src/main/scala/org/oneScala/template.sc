package oneScala

abstract class parent[T]{
  //can define a variable in abstract class
	def elem : T
	//can't declare variable in it.
	//val elem2 : T2
}

class branch[T](a:T) extends parent[T]{
	val elem = a //in real class, must implement the just defined variable.
	override def equals(other: Any) = other match{
		case that : branch[_] => (this.elem != null)
		case _ => false
	}
}

class aaa{}
class bbb extends aaa{}
trait fun[-S,+T]{
  def apply(t:S):T}
  
object template {
	def realFun(str : aaa) : String =  {"hello"	}
                                                  //> realFun: (str: oneScala.aaa)String
	def callReal(ff : aaa => String) = {
		if (ff.isInstanceOf[fun[_,_]]){
			val b1:bbb = new bbb
			println("pattern is matched")
			ff(b1)
		}
		else
		{
			println("pattern not matched")
			ff(new aaa)
		}
	}                                         //> callReal: (ff: oneScala.aaa => String)String
	def ff = realFun(new aaa)                 //> ff: => String
  if (ff.isInstanceOf[fun[_,_]])
 	println("dsf")
  callReal(realFun)                               //> pattern not matched
                                                  //| res0: String = hello
  
	val b1 = new branch[Int](9)               //> b1  : oneScala.branch[Int] = oneScala.branch@1be2b55
	println(b1.elem)                          //> 9
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class vect[t](f:t, s:t){
  	val first = f
  	val second = s
  	//this is open quesiton how to define other constructor in template class
  	def this(f:t) = this(f,f)
  }
  
  val v1 : vect[Int] = new vect[Int](1,2)         //> v1  : oneScala.template.vect[Int] = oneScala.template$$anonfun$main$1$vect$
                                                  //| 1@f536e8
  println(v1.first,v1.second)                     //> (1,2)
}