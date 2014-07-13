package pracOne
//method defined in object can be called.
object AA {
	def aa(a: Int){println(a)}
}
//apply actually like function object's override ()method.
class BB{
  	def apply(a: String){println(a)}
  	def okok(a: String){println(a)}  	
}
object BB{
  implicit def string2bb(str : String) : BB = {val bb = new BB
    println("a")
    	bb}
}
//view bound
class CC{
  def callBBviaCC[CC <% BB](cc : CC) = cc.okok("view bound")
  
}
//must define implicit method in object
object CC{
  implicit def cc2bb(cc : CC): BB = {val bb = new BB; bb}
}
object methodInObject {
	  def main(args: Array[String]) { 
	  AA.aa(2)
	  val b = new BB
	  b("joj")
	  //view bound
	  def callBBviaCC[CC <% BB](cc : CC) : Unit = {cc.okok("view bound")}
	  val dd = new CC
	  def fff(bb : BB) = {println("a")}
	  fff(dd)
	  callBBviaCC[CC](dd)
	  
	  val str = ""
	    
	  def bbHello(b : BB) = println("abbbb")
	  bbHello("sdfsadf")
	  val a5:BB = new BB
	  //@volatile var b5:BB = _
	}
}