import java.math.MathContext
import java.math.RoundingMode

object problem025 {

  def main(args: Array[String]): Unit = {
    print(findFib(0))
  }
  
  def findFib(n: Int): Int = {
    if (fib(n).precision() >= 1000) n
    else findFib(n+1)
  }
  
  def fib(n: Int): java.math.BigDecimal = {
    val goldenRatio = 1.618034
    val a = java.math.BigDecimal.valueOf(goldenRatio).pow(n, MathContext.UNLIMITED)
    val b = java.math.BigDecimal.valueOf(-0.618034).pow(n, MathContext.UNLIMITED)
    val c = java.math.BigDecimal.valueOf(scala.math.sqrt(5))
    
    (a.subtract(b)).divide(c, 0, RoundingMode.HALF_UP)
  }
}