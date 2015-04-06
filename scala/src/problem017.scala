import scala.collection.mutable.ListBuffer

object problem17 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 1 to 1000) {
      println(wordify(a))
      lb += wordify(a).replace(" ", "").replace("-", "").length()
    }
    println(lb.sum)
  }

  def wordify(a: Int) = {
    if (a < 10) single(a)
    else if (a < 100) double(a)
    else if (a < 1000) triple(a)
    else "One Thousand"
  }

  def single(a: Int): String = a match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
    case 5 => "Five"
    case 6 => "Six"
    case 7 => "Seven"
    case 8 => "Eight"
    case 9 => "Nine"
  }

  def double(a: Int): String = a match {
    case 10 => "Ten"
    case 11 => "Eleven"
    case 12 => "Twelve"
    case 13 => "Thirteen"
    case 14 => "Fourteen"
    case 15 => "Fifteen"
    case 16 => "Sixteen"
    case 17 => "Seventeen"
    case 18 => "Eighteen"
    case 19 => "Nineteen"
    case 20 => "Twenty"
    case 30 => "Thirty"
    case 40 => "Forty"
    case 50 => "Fifty"
    case 60 => "Sixty"
    case 70 => "Seventy"
    case 80 => "Eighty"
    case 90 => "Ninety"
    case _ => {
      double((a/10).toInt*10)+"-"+single(a%10)
    }
  }

  def triple(a: Int): String = a match {
    case _ => {
      val s1 = single((a/100).toInt)+" Hundred"
      val s2 = if (a%100!=0) " And " + wordify(a%100) else ""
      s1 + s2
    }
  }
}