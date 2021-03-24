package Array

object Scala_Array4
{
  def test(x: Array[Int], y: Array[Int]): Boolean = {
    if (x.length < 1 || y.length < 1) false 
    else (x.head == y.head) || (x.last == y.last)
  }
  
  
  def main(args: Array[String]): Unit = 
 {
   println(test(Array(1,2,3,4), Array(2,3,4)))
   println(test(Array(1,2,3,4), Array(1,3,4)))
   println(test(Array(1,2,3,4), Array(1,3,4,5)))
   println(test(Array(2,2,3,4), Array(1,3,4,5)))
  }
}
