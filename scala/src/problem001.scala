object problem1 {

  def main(args: Array[String]): Unit = {
    var i = 0
    for (a <- 1 to 999) {
      if (a%3 == 0 || a%5 == 0)
        i += a
    }
    println(i)
  }
  
}