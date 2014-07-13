package pracOne

object actorUsage {
	val count2 : PartialFunction[Any,Unit] = {
		case "" => println("nothing")
		case ("","") => println("I am triple")
		case _ => println("I am default")
	}                                         //> count2  : PartialFunction[Any,Unit] = <function1>
	
	count2.apply("","")                       //> I am triple
	count2.apply(9)                           //> I am default
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}