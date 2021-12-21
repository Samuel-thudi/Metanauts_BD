
import scala.io.Source

object shakespeare {
  def main(args: Array[String]): Unit = {
    val fileContents = Source.fromFile("C:\\Users\\samue\\Downloads\\shakespeare.txt").getLines.mkString
    val words = fileContents.split("\\W+")
    var x = words.groupBy(l => l).map(t => (t._1,t._2.length))
    println(x)
  }

}
