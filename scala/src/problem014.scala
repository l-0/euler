object problem14 {
  
  def main(args: Array[String]): Unit = {
	  var max = 0L
    for (a <- 1L to 1000000L) {
      //println(a)
      val length = collatzSequenceLength(a)
      if (length > max) {
        println(a+"-"+length)
        max = length      
      }
    }
  }

  def collatzSequenceLength(n: Long): Long = {
    var counter = 1
    var r = n
    while (r != 1) {
      r = nextCollatz(r)
      counter += 1
    }
    counter
  }
  def nextCollatz(n: Long): Long = {
    if (n%2==0) return n/2
    else return 3*n+1
  }

}