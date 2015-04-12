object problem092 {

  def main(args: Array[String]): Unit = {
    val startingPoints = for (a <- 0 until 10000000 if chain(a.toString()).contains("89")) yield a
    println(startingPoints.size)
  }
  
  def chain(n: String): List[String] = {
    def agg(n: String, res: List[String]): List[String] = {
      if (!res.isEmpty && List("89", "1", "0").contains(res.last)) {res}
      else agg(calc(n), res :+ n)
    }
    agg(n, List.empty)
  }

  def calc(s: String): String = {
    (for (a <- s.map(x => x.asDigit)) yield (a*a)).sum.toString
  }
}