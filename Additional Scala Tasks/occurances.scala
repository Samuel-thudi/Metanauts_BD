import scala.Console.println

object occurances {
  def main(args: Array[String]): Unit = {
    val list =  Seq("apple", "oranges", "apple", "banana", "apple", "oranges", "oranges","watermelon","watermelon","mango")

    var x = list.groupBy(l => l).map(t => (t._1,t._2.length))
    println(x)
  }

}
