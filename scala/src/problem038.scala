import scala.collection.mutable.ListBuffer

object problem038 {

  def main(args: Array[String]): Unit = {
    
    val lb = new ListBuffer[Int]
    for (a <- 1 to 9999) {
      val pan = new ListBuffer[Int]
      for (b <- 1 to 8) {
        pan += a*b
        if (isPan(pan.mkString)) {
          lb += pan.mkString.toInt
        }
      }
    }
    println(lb.max)
  }

  def isPan(s: String): Boolean = {
    s.length==9&&s.distinct.sorted.equals("123456789")
  }
}