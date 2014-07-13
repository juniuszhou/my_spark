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

//val s = new ServiceImpl with  BeforeServiceAspect with AfterServiceAspect
//how to use isInstanceOf to judge inheritance relationship
if ((new ServiceImpl).isInstanceOf[Service])
	println("is sub class ")                  //> is sub class 
//s.doAction()

}