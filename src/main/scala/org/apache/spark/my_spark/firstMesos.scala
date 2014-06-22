import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object firstMesos {
  def main(args: Array[String]) {
    val logFile = "/home/junius/spark-0.9.1/README.md" // Should be some file on your system

    var str = System.getProperty("java.library.path")
    str = "/home/junius/mesos/lib:" + str
    System.setProperty("java.library.path", str)
    val conf = new SparkConf()
    	.setMaster("mesos://192.168.11.143:5050")
    	.setAppName("Simple app")
    	.set("spark.mesos.coarse", "true")
    	
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}