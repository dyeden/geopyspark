package geopyspark.geotrellis

import geotrellis.raster._
import geotrellis.spark._

import org.apache.spark._
import org.apache.spark.rdd.RDD

object UByteArrayTileWrapper extends Wrapper[UByteArrayTile] {

  def testRdd(sc: SparkContext): RDD[UByteArrayTile] = {
    val arr = Array(
      UByteArrayTile(Array[Byte](0, 0, 1, 1), 2, 2),
      UByteArrayTile(Array[Byte](1, 2, 3, 4), 2, 2),
      UByteArrayTile(Array[Byte](5, 6, 7, 8), 2, 2))
    println("\n\n\n")
    println("THESE ARE THE ORIGINAL UBYTEARRAYTILES")
    arr.foreach(println)
    println("\n\n\n")
    sc.parallelize(arr)
  }
}
