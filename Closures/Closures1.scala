package Closures

object Closures1 {

  def main(args: Array[String]){
   println("Final sum(1) value = "+ sum(1))
   println("Final sum(2) value ="+sum(2))
    println("Final sum(3) value ="+sum(3))
  }
  val a:Int=4
  val sum = (b:Int) => a+b

}
