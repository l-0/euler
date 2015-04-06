import scala.collection.mutable.ListBuffer
import java.math.BigInteger

object problem49 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 1000 to 9999) {
      if (BigInteger.valueOf(a).isProbablePrime(100)) {
        lb += a
      }
    }
    val sameDigitsAndAtLeastThree = lb.toList.groupBy { x => checksum(x) }.filter(y => y._2.size >= 3)

    sameDigitsAndAtLeastThree.values.foreach { x => if (isProgression(x, List())) println(x) }
  }

  def checksum(x: Int) = {
    val ca = x.toString().toCharArray()
    val l = for (a <- 0 until ca.length) yield ca.apply(a).asDigit
    l.sorted
  }

  def isProgression(l: List[Int], diffs: List[Int]): Boolean = {
    if (l.size == 0 || l.size == 1) false
    else {
      val diff = l.tail.apply(0)-l.head
      if (diffs.contains(diff)) {println(diff+"-"+l.tail.apply(0)+"-"+l.head); true}
      else isProgression(l.tail, diffs :+ diff)
    }
  }
}