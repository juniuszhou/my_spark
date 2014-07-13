package oneScala

object functionss{
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	//normal func
	def add(x :Int, y :Int) = x+y             //> add: (x: Int, y: Int)Int
	def add2(x :Int, y :Int) :Int = x+y       //> add2: (x: Int, y: Int)Int
	
	//call by value, evaluate y only if necessary.
	def logicAnd(x :Boolean, y : => Boolean) = {
		if (x) y else false
	}                                         //> logicAnd: (x: Boolean, y: => Boolean)Boolean
	
	//high order function
	def g(f :  Int => Int)(x: Int) = f(x)     //> g: (f: Int => Int)(x: Int)Int
	def ll(x :Int) = x+x                      //> ll: (x: Int)Int
	g(ll)(5)                                  //> res0: Int = 10
	
	//tail recursion
	def scopeSum(min :Int, max :Int) : Int = {
		if (min >= max) 0 else min + scopeSum(min+1,max)
	}                                         //> scopeSum: (min: Int, max: Int)Int
	
	def tailScopeSum(min1 :Int, max1 :Int) : Int = {
		def sum1(min1 :Int, max1 :Int,sum2 :Int) : Int = {
			if (min1 > max1) sum2 else {
								sum1(min1 +1,max1,sum2+min1)
			}
		}
		sum1(min1,max1,0)
	}                                         //> tailScopeSum: (min1: Int, max1: Int)Int
	tailScopeSum(1,100)                       //> res1: Int = 5050

	//partial apply func, part of parameter binded, then you got a new func
	def partialF(m: Int) = (n: Int) => {
		println(m);
		println(n);
	}                                         //> partialF: (m: Int)Int => Unit
	def pf = partialF(2)                      //> pf: => Int => Unit
  pf(3)                                           //> 2
                                                  //| 3
  List(1,2,3,4).foreach(print _ )                 //> 1234
	
	//currying  Currying is the technique of transforming a function that takes multiple arguments
  //in such a way that it can be called as a chain of functions each with a single argument.
	def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)                       //> filter: (xs: List[Int], p: Int => Boolean)List[Int]

  def modN(n: Int)(x: Int) = ((x % n) == 0)       //> modN: (n: Int)(x: Int)Boolean

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)         //> nums  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(filter(nums, modN(2)))                  //> List(2, 4, 6, 8)
  println(filter(nums, modN(3)))                  //> List(3, 6)
  
  //func as object
  class myFunClass extends Function1[Int,Int]{
  	def apply(x: Int) = x * x
  }
  val funObj = new myFunClass()                   //> funObj  : oneScala.functionss.myFunClass = <function1>
  funObj.apply(3)                                 //> res2: Int = 9
  
  //repeat parameters
  def funcRep(args : String*) = {for (arg <- args) println(arg)}
                                                  //> funcRep: (args: String*)Unit
  funcRep("hello ","world","!")                   //> hello 
                                                  //| world
                                                  //| !
  //closure catch the variable until exec the fun.
  //means it actually bind an address.
  val more = 1                                    //> more  : Int = 1
  val addMore = (x:Int) => x+more                 //> addMore  : Int => Int = <function1>
  if (true)	{
  	val more = 3
  	addMore(2)
	}                                         //> res3: AnyVal = 3
  
  //binded thing is address, not value. it is clear in following case.
  var more2 = 2                                   //> more2  : Int = 2
  val addMore2 = (x:Int) => x+more2               //> addMore2  : Int => Int = <function1>
  if (true)	{
  	more2 = 3
  	addMore2(2)
	}                                         //> res4: AnyVal = 5
	
  //repeated op
  def twice(op : Int => Int, x : Int) = op(op(x)) //> twice: (op: Int => Int, x: Int)Int
  def dou(x:Int) : Int = x*2                      //> dou: (x: Int)Int
  twice(dou,25)                                   //> res5: Int = 100
  
  //option, we can return an int or nothing
  def retOpt(a:Int):Option[Int] =
  {
  	if (a>0) return Some(a)
  	else return None
  }                                               //> retOpt: (a: Int)Option[Int]
  
  retOpt(0) match{
  	case None => println("I am nothing")
  	case Some(_) => println("I am some")
  }                                               //> I am nothing
  	
}