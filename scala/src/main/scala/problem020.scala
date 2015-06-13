import java.math.BigInteger

object problem20 {

  def main(args: Array[String]): Unit = {
    val f = factorial(100)
    println(f);
    var s = 0
    f.toString().foreach { x => s += x.asDigit }
    println(s)
    
  }

  def factorial(n: Int): BigInteger = {
    if (n == 1) BigInteger.ONE
    else BigInteger.valueOf(n).multiply(factorial(n-1))
  }
}