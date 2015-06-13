import java.math.BigInteger

object problem16 {

  def main(args: Array[String]): Unit = {
    val b = BigInteger.valueOf(2).pow(1000);
    println(b)
    var s = 0
    b.toString().foreach { x => s += x.asDigit }
    println(s)
  }

}