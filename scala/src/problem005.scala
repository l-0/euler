object problem5 {
  
  def main(args: Array[String]): Unit = {
    for (a <- 20 to Integer.MAX_VALUE) {
      if (isDivisible(a, 1 to 20)) {
        println(a)
        return
      }
    }
    
  }

  def isDivisible(a: Int, range: Range): Boolean = {
    for(i <- range) {
      if (a%i != 0) {
        return false
      }
    }
    return true
  }

}