package oneScala

object traits {
	trait Service{
		def doAction() : Unit = {
		}
	}
	
  trait BeforeServiceAspect extends Service{
    abstract override def doAction(): Unit = {
        println("before doAction ... " )
        super.doAction();
    }
}

trait AfterServiceAspect extends Service{
    abstract override def doAction(): Unit = {
        super.doAction();
        println("after doAction ... ");
    }
}

class ServiceImpl extends Service{
    override def doAction(){
        println("do job");
    }
}

class Atrait {
}

class Btrait extends Atrait with Service{
}

//how to use ordered trait
class Rational(a: Int, b: Int) extends Ordered[Rational]{
  def compare(that: Rational) = 1
}

// the order for same name function
trait printa{
  def p() = println(" print a")
}

trait printb{
  def p() = println(" print b")
}

class printc{
}

//if multiple implementatin in trait, the most right implementation will be defautl one.
class printdd extends printc with printa with printb {
  override def p() = {super.p()}
}

class printe extends printc with printb with printa {
  override def p() = {super.p()}
};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1144); 

val d = new printdd;System.out.println("""d  : oneScala.traits.printdd = """ + $show(d ));$skip(6); 
d.p();$skip(20); 

val e = new printe;System.out.println("""e  : oneScala.traits.printe = """ + $show(e ));$skip(6); 
e.p();$skip(208); 

//val s = new ServiceImpl with  BeforeServiceAspect with AfterServiceAspect
//how to use isInstanceOf to judge inheritance relationship
if ((new ServiceImpl).isInstanceOf[Service])
	println("is sub class ")}
//s.doAction()

}
