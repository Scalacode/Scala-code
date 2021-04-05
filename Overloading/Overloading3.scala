package Overloading

object Overloading3 {


  // Function 1
  def fun(name:String, No:Int)
  {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }

  // Function 2
  def fun(No:Int, name:String )
  {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }
}
object Main
{
  // Main Function
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new Overloading3()
    obj.fun("Rolex", 10);
    obj.fun("Omega", 10);
  }
}
