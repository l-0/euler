object problem7 {
  
  def main(args: Array[String]): Unit = {
    var i = 1L
    var p = 0
    while(p < 10002) {
      if (isPrime(i)) {
        println(p + ": " + i)
        p += 1
      }
      i += 1L
    }
  }

  def isPrime(a: Long): Boolean = {
    if (a == 1) return true
    for (i <- 2L to a) {
      if (i!=a && a%i==0) return false
    }
    return true
  }

}