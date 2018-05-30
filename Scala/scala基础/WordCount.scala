package src

object WordCount {
  def main(args: Array[String]): Unit = {
    val words=List("hello tom hello jerry", "hello jerry", "hello kitty")
    val result01 = words.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
    val result02 =words.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
    println(result01)
    println(result02)
  }
}
//并行计算就求和：lst0.par.reduce(_+_)
