import scala.collection.mutable.ListBuffer

object problem043 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Long]
    for (p <- "0123456789".permutations) {
      if (isDivisible(p)) lb+=p.toLong
    }
    println(lb.sum)
  }

  def isDivisible(s: String): Boolean = {
      val p = s.map(x => x.asDigit.toString())
      val div2 = (p.apply(1)+p.apply(2)+p.apply(3)).toInt%2==0
      val div3 = (p.apply(2)+p.apply(3)+p.apply(4)).toInt%3==0
      val div5 = (p.apply(3)+p.apply(4)+p.apply(5)).toInt%5==0
      val div7 = (p.apply(4)+p.apply(5)+p.apply(6)).toInt%7==0
      val div11 = (p.apply(5)+p.apply(6)+p.apply(7)).toInt%11==0
      val div13 = (p.apply(6)+p.apply(7)+p.apply(8)).toInt%13==0
      val div17 = (p.apply(7)+p.apply(8)+p.apply(9)).toInt%17==0
      return div2&&div3&&div5&&div7&&div11&&div13&&div17 
  }
}