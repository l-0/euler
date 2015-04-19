object problem206 {

  def main(args: Array[String]): Unit = {
    println(loop(1010101010L))
  }
  
  def loop(i: Long): Long = {
    if (findNum(i)) i
    else loop(i+1L)
  }

  def findNum(a: Long) = {
    val l = (a*a).toString.map(x=>x.asDigit)
    if (l.size<19) false
    else l(0)==1&&l(2)==2&&l(4)==3&&l(6)==4&&l(8)==5&&l(10)==6&&l(12)==7&&l(14)==8&&l(16)==9&&l(18)==0
  }
}