

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.rdd.CartesianRDD
import org.apache.spark.rdd.RDD


object startUp {
  def main(args: Array[String]) {
    val logFile = "/home/junius/spark-0.9.1/read.md" // Should be some file on your system
    val sc = new SparkContext("local", "Simple App")
    val logData : RDD[String] = sc.textFile(logFile, 2).cache()
    val logFile2 = "/home/junius/spark-0.9.1/read2.md" // Should be some file on your system
    val log2Data : RDD[String] = sc.textFile(logFile2, 2).cache()
    //get a Cartesian RDD
    val cartesianData = logData.cartesian(log2Data)
    //cartesianData.filter(line => {println(line); true}).count
    println(cartesianData.partitions.length)
    //get a union RDD
    val unionData = logData.union(log2Data)
    //unionData.filter(line => {println(line); true}).count
    
    val groupData = unionData.map(x => (x,null)).groupByKey(unionData.partitions.length)
    println(groupData.toDebugString)
    
    println(logData.reduce((s1, s2) => s1 + s2))
    println(logData.fold("being with ")((s1, s2) => s1 + s2))
    
    //println(logData.aggregate("OK ")( ((s1, s2) => s1 + s2), ((s1, s2) => s1 + s2 + " END ")))
    
    println(logData.first())
    val top3 : Array[String] = logData.top(3)
    top3 map (line => println(line))
    
    //not supported in this version
    //val intersetData = logData.intersection(log2Data)
    val data1 = log2Data.keyBy(x  => ( x + " extra"))
    println(data1.map(x => println(x._1 + x._2)).count)
    
  
    
    
    //val numAs = logData.filter(line => line.contains("a")).count()
    //val numBs = logData.filter(line => line.contains("b")).count()
    ///println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}

