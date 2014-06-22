import org.apache.spark.streaming._
import org.apache.spark.streaming.StreamingContext._
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel

object firstStreaming {
  def main(args: Array[String]) {
    
    val sparkConf = new SparkConf().setAppName("count ")
    							   .setMaster("local[4]")
    
    val sc = new StreamingContext(sparkConf, Seconds(10))
    val port : Int = 9999
    // socketTextStream just connect to this port and then get data.
    //So you must must must run nc -lk 9999 before run this program.
    val lines = sc.socketTextStream("192.168.11.143", port, StorageLevel.MEMORY_ONLY_SER)
    val words = lines.flatMap(_.split(" "))
    val counts  = words.map(x => (x, 1)).reduceByKey(_ + _)
    counts.print()
    sc.start()
    sc.awaitTermination()    
  }
}