import scala.collection.mutable.ListBuffer

object problem036 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 1 to 1000000) {
      if (isPalindrome(a.toString.toList) && isPalindrome(toBinary(a).toString.toList)) {
        lb += a
      }
    }
    println(lb.sum)
        
  }

  def toBinary(n: Int): String = {
    def agg(n: Int, l: List[Int]): List[Int] = {
      if (n == 0) l :+ n
      else if (n == 1) l :+ n
      else if (n%2==0) agg(n/2, l :+ 0)
      else agg((n-1)/2, l :+ 1)
    } 
    agg(n, List.empty).reverse.mkString
  }
  
  def isPalindrome(l: List[Char]): Boolean = {
    if (l.isEmpty || l.size == 1) return true
    if (l.take(1) != l.takeRight(1)) {
      return false
    }
    return isPalindrome(l.drop(1).dropRight(1))
  }
}