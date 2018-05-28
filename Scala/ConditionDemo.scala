package src

object ConditionDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val y = if(x > 1) 1 else -1
    println(y)
    val z = if(x > 0) 0 else if (x > 1) 1 else -1
    println(z)
  }
}
