package src
import scala.collection.mutable.ArrayBuffer
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](10)
    arr(1)=10
    arr(2)=20
    println(arr)
    println(arr.toBuffer)
    val arr1 = Array[Int](10)
    println(arr1.toBuffer)
    val arr2 = Array("hadoop","storm","spark")
    println(arr2(2))
    //变长数组（数组缓冲）
    //如果想使用数组缓冲，需要导入import scala.collection.mutable.ArrayBuffer包
    val ab = ArrayBuffer[Int]()
    //向数组缓冲的尾部追加一个元素
    //+=尾部追加元素
    ab += 1
    //追加多个元素
    ab += (2, 3, 4, 5)
    //追加一个数组++=
    ab ++= Array(6, 7)
    //追加一个数组缓冲
    ab ++= ArrayBuffer(8,9)
    //打印数组缓冲ab

    //在数组某个位置插入元素用insert
    ab.insert(0, -1, 0)
    //删除数组某个位置的元素用remove
    ab.remove(8, 2)
    println(ab)

  }
}
