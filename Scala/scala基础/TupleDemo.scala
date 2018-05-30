package src

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val t, (a, b, c) = ("spark", 5.20, 1314)
    println(t)
    println(t._1)
    println(t._2)
    println(t._3)
  }
}
//注意：元组的下标识从1开始的