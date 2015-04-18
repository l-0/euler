object problem040 {

  def main(args: Array[String]): Unit = {
    val l = (for (a <- 1 to 1000000) yield a.toString).mkString.map(x=>x.asDigit.toLong)
    val s = l(0)*l(9)*l(99)*l(999)*l(9999)*l(99999)*l(999999)
    println(s)
  }
}