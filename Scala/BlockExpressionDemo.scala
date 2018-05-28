package src

object BlockExpressionDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val result ={
      if(x > 1) -1
      else if (x > 0) 0
      else "error"
    }
println(result)
  }

}
