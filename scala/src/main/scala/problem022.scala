import java.util.Base64
import scala.io.Source

object problem022 {

  def main(args: Array[String]): Unit = {
    val names = Source.fromURL(new String(Base64.getDecoder
        .decode("aHR0cHM6Ly9wcm9qZWN0ZXVsZXIubmV0L3Byb2plY3QvcmVzb3VyY2VzL3AwMjJfbmFtZXMudHh0")))
        .mkString
        .split(",")
        .toList
        .map { x => x.replace("\"", "") }
        
    val scores = for (name <- names.sorted) yield value(name)*(names.sorted.indexOf(name)+1)
    println(scores.sum)
  }

  def value(name: String) = {
    val values = for (letter <- name) yield letter.getNumericValue-9
    values.sum
  }
}