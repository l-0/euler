object problem6 {
  
  def main(args: Array[String]): Unit = {
    val s1 = sumOfSquares(100)
    val s2 = squareOfSum(100)
    println((s2-s1).toInt)
  }

  def sumOfSquares(n: Int): Double = {
    var s = 0D
    for (a <- 1 to n) {
      s += Math.pow(a, 2)
    }
    s
  }

  def squareOfSum(n: Int): Double = {
    var s = 0D
    for (a <- 1 to n) {
      s += a
    }
    Math.pow(s, 2)
  }

}