package oneScala
abstract class caseObj{}
final case class myCaseOne extends caseObj{}
final case class myCaseTwo extends caseObj{}
trait myTrait[T]{}
/*List implementation in syste
abstract List[T]
*/
object myList {
	val p:caseObj = new myCaseOne()           //> p  : oneScala.caseObj = myCaseOne()
		p match{
			case myCaseOne => println{"hello "}
			case myCaseTwo => println{"world"}
		}                                 //> hello 
		
		// :: is a class, then :: here is his constructor. :: build the list object
		//from right to left.
		val ll:List[Int] = 1 :: 2 :: 3 :: Nil
                                                  //> ll  : List[Int] = List(1, 2, 3)
                                                  
    val lNum : List[Int] = List(1,2,3)            //> lNum  : List[Int] = List(1, 2, 3)
    val lAlpha : List[Char] = List('a','b','c')   //> lAlpha  : List[Char] = List(a, b, c)
    //lNum.
		val mytrait : myTrait[Int] = null //> mytrait  : oneScala.myTrait[Int] = null
		
}