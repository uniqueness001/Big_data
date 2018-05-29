package src
import scala.collection.mutable._
object MutListDemo {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1,2,3)
    //创建一个空的可变列表
    val lst1 = new ListBuffer[Int]
    //向lst1中追加元素，注意：没有生成新的集合
    lst1 += 4
    lst1.append(5)

    //将lst1中的元素最近到lst0中， 注意：没有生成新的集合
    lst0 ++= lst1

    //将lst0和lst1合并成一个新的ListBuffer 注意：生成了一个集合
    val lst2= lst0 ++ lst1

    //将元素追加到lst0的后面生成一个新的集合
    val lst3 = lst0 :+ 5
  }
}
