import scala.collection.mutable.ListBuffer
import java.math.BigInteger

object problem029 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[BigInteger]
    for (a <- 2 to 100;b <- 2 to 100) {
      lb += BigInteger.valueOf(a).pow(b)
    }
    println(lb.distinct.size)
  }
}