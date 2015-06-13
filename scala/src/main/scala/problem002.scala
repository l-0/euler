object problem2 {
  
  def main(args: Array[String]): Unit = {
    val fibs = for (a <- 1 until 4000000) yield fib(a)
    println(fibs.sum)
  }
  
  def fib(a: Int): Int = {
    if (a == 1) return 1
    if (a == 2) return 2
    fib(a-1) + fib(a-2)
  }

}