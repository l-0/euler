import java.math.BigDecimal

object problem048 {

  def main(args: Array[String]): Unit = {
    val series = for (a <- 1 to 1000) yield BigDecimal.valueOf(a).pow(a)
    val res = sum(series, BigDecimal.ZERO)
    print(res.toString.takeRight(10))
  }
  
  def sum(series: IndexedSeq[BigDecimal], s: BigDecimal): BigDecimal = {
    if (series.length == 0) s
    else sum(series.tail, s.add(series.head))
  }
}