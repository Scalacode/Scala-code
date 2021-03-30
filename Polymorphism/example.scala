package Polymorphism

class example {

  def func (a: Int): Unit ={
    println("First Execution: "+a)
  }
  def func(a: Int , b:Int): Unit = {
    var sum = a+b
    println("Second execution: "+sum)
  }
  def func (a: Int, b:Int,c:Int): Unit ={
    var product= a*b*c;
    println("Third execution: "+product)
  }
}
object  Poly {
  def main(args: Array[String]): Unit ={

    var obj=new example();
    obj.func(120)
    obj.func(130,170)
    obj.func(9,8,10)
  }
}
