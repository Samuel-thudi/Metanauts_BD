object large_small {
  def main(args: Array[String]): Unit = {
    val num = 1 to 40 by 3
    println("List is:")
    println(num)

    println("largest num of list:", num.max)
    println("Smallest num of list:", num.min)

  }

}
