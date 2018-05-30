package src

object zipDemo {
  def main(args: Array[String]): Unit = {
    val names =Array("ziyu","fumin","guoxin")
    val scores =Array(100,90,80)
    val ns =names.zip(scores)
    println(ns.toBuffer)
  }

}
