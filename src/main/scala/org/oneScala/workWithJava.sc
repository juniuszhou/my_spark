package oneScala
//ok if tt not defined in trait.
trait t{
	def tt:String
}

class a{
	//no ok if aa not defined in class
	//def aa : String
	def aa : String = {return ""}
}
//we can define abstrac class with some not defined member.
abstract class b{
	def bb:String
}

class bc extends b {
	def bb:String = {"Hello"}
	var bd = bb
}

class food{}
class grass extends food{}
abstract class fish{
	//if no <: definition, eat in bigfish can't pass compilation
	type foodtype <: food
	def eat(fd: foodtype)
}

class bigfish extends fish{
	type foodtype = grass
	def eat(fd:grass) = {2}
}

object workWithJava {
	val bcp : bc = new bc;
	println(bcp.bd)
	var a = List(1,2)
	println(a.head)
	a.head
	a.tail
	//throw and catch exception.
	def excep() = throw new RuntimeException("as")
	try {
		excep()
		println("after throws ")
	}
	catch {
	case e : RuntimeException => println("io exception here")
	}
  println("Welcome to the Scala worksheet")
}