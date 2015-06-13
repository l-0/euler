object problem1 {

  def main(args: Array[String]): Unit = {
    val multiples = for (a <- 1 to 999 if a%3 == 0 || a%5 == 0) yield a
    println(multiples.sum)
  }
  
}