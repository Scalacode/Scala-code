package Overloading

object Overloading2 {

  // Adding three integer elements
  def fun(p:Int, q:Int, r:Int)
  {
    var Sum = p + q + r;
    println("Sum in function 1 is:"+Sum);
  }

  // Adding three double elements
  def fun(p:Double, q:Double, r:Double)
  {
    var Sum = p + q + r;
    println("Sum in function 2 is:"+Sum);
  }
}
object Main
{
  // Main method
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new Overloading2.();
    obj.fun(6, 8, 10);
    obj.fun(5.9, 10.01, 58.7);
  }
}
