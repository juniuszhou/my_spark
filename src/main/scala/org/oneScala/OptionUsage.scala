package com.junius

object OptionUsage {
  def main(args: Array[String]) {
    def opt(i : Int) : Option[Int] = {
      if (i>0) return Some(i)
      else return None
    }
    
    if (opt(8) == Some(8)){
      println("I am eight")
    }
    println("game over")
  }

}