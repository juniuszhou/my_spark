package com.junius
import scala.collection.immutable.Set
import scala.collection.mutable.ListBuffer

object ListOps {
def main(args: Array[String]) {
    val lNum : List[Int] = List(1,123,3)
    val lAlpha : List[Char] = List('a','b','c')
    val lStr : List[String] = List("hello","world")
    def listJoin[L,R](left : List[L], right : List[R]) : List[(L,R)] = {
      for (v <- left; w <- right) yield (v, w)
    }
    def listUniqueCount[T](listWords : List[T]) : List[(T,Int)] = {
      listWords.map(a => (a, 1))
    }
    def listCount[T](listCounts : List[(T,Int)]) : (T,Int)= {
      val discList = listCounts.map(_._1).distinct
      println(discList)
      
      
      var resultList : ListBuffer[(T,Int)] = new ListBuffer
      
      discList.foreach(t => {
          var geshu : Int = 0
    	  listCounts.foreach(s => {        
    		  if(s._1 == t) geshu += s._2          
        })
        resultList += ((t,geshu))
      })
      println("statistics result as ",resultList.toList)  
      listCounts.reduce((first , second) => (first._1, first._2 + second._2))
    }
    
    
    println(lNum.reduceLeft((total,cur) => total + cur))
    
    println(listJoin(lNum,lAlpha))
    println(listJoin(lNum,lStr))
    
    println(lNum.reduce((total , cur) => total + cur))
    
    println(listCount(listJoin(lStr,lNum)))
    
    val lRep : List[Char]= List('a','a','b')
    val lZip = lRep.zip(lNum)
    println(lZip)
    println(listCount(lZip)) 
    
    val num = collection.mutable.Map(1 ->2)

    println(num.getOrElse(1, 1 -> 3))
}
    //lNum.
}