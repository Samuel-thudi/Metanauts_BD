import scala.language.postfixOps

object sum_product {
  def main(args:Array[String]): Unit = {
    val list: Range = 1 to 6
    var i = 0
    while (i < list.length) {
      i += list(i)

    }
    println("sum of elements in the list is:")
    println(i)

    val x = list.product
    print("Product of all elements in the list is:")
    println(x)

  }

}
