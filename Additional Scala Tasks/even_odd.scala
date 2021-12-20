object even_odd {
  def main(args: Array[String]): Unit =
  {
    val num = List(1,2,3,4,5,6,7,8,8,9,10,11,11,21,22,34)
    println("list is:")
    println(num)
    val even_num = num.filter(_%2 == 0)
    println("even numbers of the list are:")
    println("even_num")
    val odd_num = num.filter(_%2==1)
    println("odd numbers of the list are:")
    println(odd_num)
  }

}
