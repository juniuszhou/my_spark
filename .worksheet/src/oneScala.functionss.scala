package oneScala

object functionss{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(46); 
	//normal func
	def add(x :Int, y :Int) = x+y;System.out.println("""add: (x: Int, y: Int)Int""");$skip(37); 
	def add2(x :Int, y :Int) :Int = x+y;System.out.println("""add2: (x: Int, y: Int)Int""");$skip(121); 
	
	//call by value, evaluate y only if necessary.
	def logicAnd(x :Boolean, y : => Boolean) = {
		if (x) y else false
	};System.out.println("""logicAnd: (x: Boolean, y: => Boolean)Boolean""");$skip(64); 
	
	//high order function
	def g(f :  Int => Int)(x: Int) = f(x);System.out.println("""g: (f: Int => Int)(x: Int)Int""");$skip(22); 
	def ll(x :Int) = x+x;System.out.println("""ll: (x: Int)Int""");$skip(10); val res$0 = 
	g(ll)(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(118); 
	
	//tail recursion
	def scopeSum(min :Int, max :Int) : Int = {
		if (min >= max) 0 else min + scopeSum(min+1,max)
	};System.out.println("""scopeSum: (min: Int, max: Int)Int""");$skip(206); 
	
	def tailScopeSum(min1 :Int, max1 :Int) : Int = {
		def sum1(min1 :Int, max1 :Int,sum2 :Int) : Int = {
			if (min1 > max1) sum2 else {
								sum1(min1 +1,max1,sum2+min1)
			}
		}
		sum1(min1,max1,0)
	};System.out.println("""tailScopeSum: (min1: Int, max1: Int)Int""");$skip(21); val res$1 = 
	tailScopeSum(1,100);System.out.println("""res1: Int = """ + $show(res$1));$skip(143); 

	//partial apply func, part of parameter binded, then you got a new func
	def partialF(m: Int) = (n: Int) => {
		println(m);
		println(n);
	};System.out.println("""partialF: (m: Int)Int => Unit""");$skip(22); 
	def pf = partialF(2);System.out.println("""pf: => Int => Unit""");$skip(8); 
  pf(3);$skip(34); 
  List(1,2,3,4).foreach(print _ );$skip(133); 
	
	//partial function, just given part of parameters or even no parameter.
	def mySum(a: Int, b: Int, c: Int): Int = {
	a + b + c
	};System.out.println("""mySum: (a: Int, b: Int, c: Int)Int""");$skip(27); 
	val partialSum1 = mySum _;System.out.println("""partialSum1  : (Int, Int, Int) => Int = """ + $show(partialSum1 ));$skip(39); 
	val partialSum2 = mySum(2, _: Int, 4);System.out.println("""partialSum2  : Int => Int = """ + $show(partialSum2 ));$skip(356); 
	
	//currying  Currying is the technique of transforming a function that takes multiple arguments
  //in such a way that it can be called as a chain of functions each with a single argument.
	def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p);System.out.println("""filter: (xs: List[Int], p: Int => Boolean)List[Int]""");$skip(45); 

  def modN(n: Int)(x: Int) = ((x % n) == 0);System.out.println("""modN: (n: Int)(x: Int)Boolean""");$skip(43); 

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(33); 
  println(filter(nums, modN(2)));$skip(33); 
  println(filter(nums, modN(3)))
  
  //func as object
  class myFunClass extends Function1[Int,Int]{
  	def apply(x: Int) = x * x
  };$skip(134); 
  val funObj = new myFunClass();System.out.println("""funObj  : oneScala.functionss.myFunClass = """ + $show(funObj ));$skip(18); val res$2 = 
  funObj.apply(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(90); 
  
  //repeat parameters
  def funcRep(args : String*) = {for (arg <- args) println(arg)};System.out.println("""funcRep: (args: String*)Unit""");$skip(32); 
  funcRep("hello ","world","!");$skip(105); 
  //closure catch the variable until exec the fun.
  //means it actually bind an address.
  val more = 1;System.out.println("""more  : Int = """ + $show(more ));$skip(34); 
  val addMore = (x:Int) => x+more;System.out.println("""addMore  : Int => Int = """ + $show(addMore ));$skip(47); val res$3 = 
  if (true)	{
  	val more = 3
  	addMore(2)
	};System.out.println("""res3: AnyVal = """ + $show(res$3));$skip(90); 
  
  //binded thing is address, not value. it is clear in following case.
  var more2 = 2;System.out.println("""more2  : Int = """ + $show(more2 ));$skip(36); 
  val addMore2 = (x:Int) => x+more2;System.out.println("""addMore2  : Int => Int = """ + $show(addMore2 ));$skip(45); val res$4 = 
  if (true)	{
  	more2 = 3
  	addMore2(2)
	};System.out.println("""res4: AnyVal = """ + $show(res$4));$skip(68); 
	
  //repeated op
  def twice(op : Int => Int, x : Int) = op(op(x));System.out.println("""twice: (op: Int => Int, x: Int)Int""");$skip(29); 
  def dou(x:Int) : Int = x*2;System.out.println("""dou: (x: Int)Int""");$skip(16); val res$5 = 
  twice(dou,25);System.out.println("""res5: Int = """ + $show(res$5));$skip(136); 
  
  //option, we can return an int or nothing
  def retOpt(a:Int):Option[Int] =
  {
  	if (a>0) return Some(a)
  	else return None
  };System.out.println("""retOpt: (a: Int)Option[Int]""");$skip(106); 
  
  retOpt(0) match{
  	case None => println("I am nothing")
  	case Some(_) => println("I am some")
  }}
  	
}
