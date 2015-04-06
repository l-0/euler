object problem9 {
  
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000) {
      if (a+b+c==1000 && isTriplet(a, b, c)) {
        println("%s-%s-%s".format(a, b, c))
        println(a*b*c)
      }
    }
  }

  def isTriplet(a: Int, b: Int, c: Int): Boolean = {
    if (a > b || a > c || b > c || c < b || c < a) {
      return false
    }
    if ((Math.pow(a, 2) + Math.pow(b, 2)) != Math.pow(c, 2)) {
      return false
    }
    return true
  }

}