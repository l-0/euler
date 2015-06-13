object problem4 {
  
  def main(args: Array[String]): Unit = {
    var m = 0
    for (a <- 999 to 100 by -1; b <- 999 to 100 by -1) {
      val p = isPalindrome((a*b).toString.toList)
      if (p && a*b > m) {m = a*b}
    }
    println(m)
  }

  def isPalindrome(l: List[Char]): Boolean = {
    if (l.isEmpty || l.size == 1) return true
    if (l.take(1) != l.takeRight(1)) {
      return false
    }
    return isPalindrome(l.drop(1).dropRight(1))
  }
 

}