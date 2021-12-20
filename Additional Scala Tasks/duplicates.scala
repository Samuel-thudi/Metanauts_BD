object duplicates {
  def main(args: Array[String]): Unit={
    val list: Seq[Int] = Seq(1,1,1,3,3,2,3,3,4,4,5,6,6,7,8,8,9,9,9)
    println("list is:", list)
    println("Unique elements in list are:", list.toSet.toSeq)

  }

}
