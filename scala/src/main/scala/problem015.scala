object problem015 {

  def main(args: Array[String]): Unit = {
    println(catalanNumber(20))
  }

  def catalanNumber(n: Int): BigInt = {
    fac(2*n)/(fac(n)*fac((2*n)-n))
  }

  def fac(n: BigInt): BigInt = {
    if (n == 0) 1
    else n*fac(n-1)
  }
}