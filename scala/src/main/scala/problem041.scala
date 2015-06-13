object problem041 {

  def main(args: Array[String]): Unit = {
    val l = for (p <- "1234567".permutations.toList if (BigInt(p).isProbablePrime(100))) yield p
    println(l.max)
  }
}