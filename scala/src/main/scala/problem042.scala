import scala.io.Source
import java.util.Base64

object problem042 {

  def main(args: Array[String]): Unit = {
    val words = Source.fromURL(new String(Base64.getDecoder
      .decode("aHR0cHM6Ly9wcm9qZWN0ZXVsZXIubmV0L3Byb2plY3QvcmVzb3VyY2VzL3AwNDJfd29yZHMudHh0")))
      .mkString
      .split(",")
      .map(x=>x.replace("\"", ""))
          
    val triWords = for (word <- words if (findTriangular(value(word)))) yield word
    println(triWords.size)
  }

  def findTriangular(value: Int) = {
    def agg(i: Int, value: Int): Boolean = {
      if (triangular(i)==value) true
      else if (i == 5000) false
      else agg(i+1, value)
    }
    agg(0, value)
  }

  def value(word: String) = {
    val values = for (letter <- word) yield letter.getNumericValue-9
    values.sum
  }
  
  def triangular(i: Int) = {
    ((i*0.5)*(i+1)).toInt
  }

}