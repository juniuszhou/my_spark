

object simplePrac{
  def main(args : Array[String]){
    println(System.getProperty("java.library.path"))
    var str = System.getProperty("java.library.path")
    str += ":/home/junius/mesos-0.18.0/build/src/"
    System.setProperty("java.library.path", str)
    println(System.getProperty("java.library.path"))
    
  }
}

