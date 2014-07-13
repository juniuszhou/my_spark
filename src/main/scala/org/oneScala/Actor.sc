package oneScala

import scala.actors._
import scala.actors.Actor._


class myActor extends Actor{
  def act(){
    for (i <- 1 to 5){
      println("I am actor now number is ",i)
      Thread.sleep(1000)
    }
  }
}

class recvSendActor extends Actor{
  def act(){
    loopWhile(true){
      reactWithin(500){
        case n:String => println("got msg is ",n)
        case TIMEOUT => self ! 100
      }
    }
  }
}

class sendActor extends Actor{
  var target1 : recvSendActor = null
  def act(){
    loopWhile(true){
      reactWithin(500){
        case m => {
          val str = "Hello"
          target1 ! str
        }
      }
    }
  }
  def setTarget(t:recvSendActor){
    this.target1 = t
  }
}

object Actor {
//val act1 = new myActor
      //create an actor via helper method.
      /* val act2 = actor {
        for (i <- 1 to 5){
        	println("I am actor 2 now number is ",i)
        	Thread.sleep(1000)
        }
      } */
      //act1.start()
      //act2.start()
      
      val act3 = new recvSendActor                //> act3  : oneScala.recvSendActor = oneScala.recvSendActor@4532ba
      val act4 = new sendActor                    //> act4  : oneScala.sendActor = oneScala.sendActor@1b030d8
      //act4.setTarget(act3)
      //act3.start
      //act4.start
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}