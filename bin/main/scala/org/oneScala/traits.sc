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
}

val d = new printdd                               //> d  : oneScala.traits.printdd = oneScala.traits$printdd@3e0694a5
d.p()                                             //>  print b

val e = new printe                                //> e  : oneScala.traits.printe = oneScala.traits$printe@794a70bf
e.p()                                             //>  print a

//val s = new ServiceImpl with  BeforeServiceAspect with AfterServiceAspect
//how to use isInstanceOf to judge inheritance relationship
if ((new ServiceImpl).isInstanceOf[Service])
	println("is sub class ")                  //> is sub class 
//s.doAction()

}