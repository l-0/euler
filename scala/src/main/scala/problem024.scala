import scala.collection.mutable.ListBuffer

object problem024 {
  
  def main(args: Array[String]): Unit = {
//    val res = permute("0123456789")
//    println(res.apply(999999))
    println("0123456789".permutations.drop(999999).next()) // shortcut :P
  }
  
  def permute(s: String): List[List[Int]] = {
    permute(s.map(x => x.asDigit).toList, List[List[Int]]())
  }

  def permute(n: List[Int], res: List[List[Int]]): List[List[Int]] = {
    val k = for (x <- 0 until n.size-1 if n.apply(x) < n.apply(x+1)) yield x
    if (k.isEmpty) res :+ n
    else {
      val l = for (x <- 0 until n.size if n.apply(x) > n.apply(k.max)) yield x
      val swapped = swap(n, k.max, l.max)
      val reversed = reverse(swapped, k.max)
      permute(reversed, res :+ n) 
    }
  }

  def swap(n: List[Int], k: Int, l: Int): List[Int] = {
    val kv = n.apply(k)
    val lv = n.apply(l)
    val swap = n.updated(k, lv)
    swap.updated(l, kv)
  }

  def reverse(n: List[Int], k: Int) = {
    val head = n.slice(0, k+1)
    val tail = n.slice(k+1, n.size)
    head ::: tail.reverse
  }
}