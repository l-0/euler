object problem2 {
  
  def main(args: Array[String]): Unit = {
    var s = 0
    var i = 1
    while (s < 4000000) {
      val f = fib(i)
      if (f%2==0) s += f
      i += 1
    }
    println(s)
  }
  
  def fib(a: Int): Int = {
    if (a == 1) return 1
    if (a == 2) return 2
    fib(a-1) + fib(a-2)
  }

}