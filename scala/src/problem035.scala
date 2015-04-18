import scala.collection.mutable.ListBuffer

object problem035 {

  def main(args: Array[String]): Unit = {
    val lb = new ListBuffer[Int]
    for (a <- 1 to 1000000) {
      if (BigInt(a).isProbablePrime(50)) {
        if (rotations(a).forall(x=>BigInt(x).isProbablePrime(50))) {
          lb += a
        }
      }
    }
    println(lb.size)
  }

  def rotations(a: Int): List[Int] = {
    def rotate(a: String): String = {
      a.tail :+ a.head
    }
    def agg(a: String, rot: String, res: List[String]): List[Int] = {
      if (!res.isEmpty && a == rot) res.map(x=>x.toInt)
      else agg(a, rotate(rot), res :+ rotate(rot))
    }
    agg(a.toString, a.toString, List.empty)
  }
}