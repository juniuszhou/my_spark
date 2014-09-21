// apply function
class a{
  def apply(n: Int) = {println(n.toString() + " applied")}
  def apply(n: Double) = {println(n.toString() + " applied")}
}

object algorithm {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(189); 
  val a1: a = new a;System.out.println("""a1  : a = """ + $show(a1 ));$skip(8); 
  a1(3);$skip(10); 
  a1(3.5);$skip(44); 
  println("Welcome to the Scala worksheet")}
}
