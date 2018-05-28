package src

object MethodAndFunctionDemo {
    //定义一个方法
    //方法m2参数要求是一个函数，函数的参数必须是两个Int类型
    //返回值类型也是Int类型
    def m1(f: (Int, Int) => Int) : Int = {
      f(2, 6)
    }

    //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
    val f1 = (x: Int, y: Int) => x + y
    //再定义一个函数f2
    val f2 = (m: Int, n: Int) => m * n

    //main方法
    def main(args: Array[String]) {

      //调用m1方法，并传入f1函数
      val r1 = m1(f1)
      println(r1)

      //调用m1方法，并传入f2函数
      val r2 = m1(f2)
      println(r2)
    }
  }

//将方法转换成函数（神奇的下划线）
/*
val t = for(i <- 1. to (10)) yield i *10
等于 1. to (10).map(_* 10)
 等于1. to (10).map((x : Int) =>x *10 )
  等于1. to (10).map(x  =>x *10 )
  特殊函数：类型转换 Int变为String
 val func : Int => String => { x =>x.toString  }
函数两种写法：
1、val func1 = (x : Int, y :Double) =>(y, x)
2、val func2:(Int, Double)=>(Double, Int) =>{(x,y)=>(y,x)}
神奇下划线将方法转换为函数
val f2 =m2 _
 */