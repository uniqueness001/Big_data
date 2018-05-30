package src
import scala.collection.mutable.Map
object MapDemo {
  def main(args: Array[String]): Unit = {
    // 利用箭头进行映射
    val scores01 = Map("ziyu"-> 100,"FM"-> 90,"GM"-> 80)
    //利用元组进行映射
    val scores02 = Map(("ziyu", 100),("FM", 90),("GM",80))
    println(scores01("ziyu"))
    println(scores02("FM"))
    //修改映射 getOrElse,如果映射中有值，则返回改值，没有的话返回默认值
    println(scores01.getOrElse("ziyu",0))
    println(scores01.getOrElse("coco",0))
    //增加映射元素
    scores01 += (("xiaomin",70),("xiaohua",60))
  }

}
