import org.apache.spark.SparkContext
import org.apache.spark.mllib.classification.SVMWithSGD
import org.apache.spark.mllib.regression.LabeledPoint

object firstML {
  def main(args: Array[String]) {
   /* val sc = new SparkContext("local", "Simple App")
    val data = sc.textFile("/home/junius/spark-0.9.1/mllib/data/sample_svm_data.txt")
    val parsedData = data.map { line =>
      val parts = line.split(' ')
      LabeledPoint(parts(0).toDouble, parts.tail.map(x => x.toDouble).toArray)
    }
    
    val numIterations = 20
    val model = SVMWithSGD.train(parsedData, numIterations)
    val labelAndPreds = parsedData.map { point =>
      val prediction = model.predict(point.features)
      (point.label, prediction)
    }
    
    val err = labelAndPreds.filter( r => r._1 != r._2).count.toDouble / parsedData.count
    println("Error = ", err)*/
    
  }
}
