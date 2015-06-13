import scala.collection.mutable.ListBuffer

object problem003 {
  
  def main(args: Array[String]): Unit = {
    val n = 600851475143L
    var i = 1L
    while (i < n) {
      
      if (i!=n && n%i==0 && isPrime(i)) {
        println(i)
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