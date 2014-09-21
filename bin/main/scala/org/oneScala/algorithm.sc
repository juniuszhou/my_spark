// apply function
class a{
  def apply(n: Int) = {println(n.toString() + " applied")}
  def apply(n: Double) = {println(n.toString() + " applied")}
}

object algorithm {
  val a1: a = new a                               //> a1  : a = a@4a3f02bd
  a1(3)                                           //> 3 applied
  a1(3.5)                                         //> 3.5 applied
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}