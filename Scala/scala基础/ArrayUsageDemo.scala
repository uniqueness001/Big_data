package src

object ArrayUsageDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,3,4,5)
    println(arr.sum)
    println(arr.max)
    println(arr.min)
    println(arr.sorted.toBuffer)
  }

}
