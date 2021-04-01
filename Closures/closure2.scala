package Closures

object closure2 {
  def main (args: Array[String]): Unit ={

    val employee:Int  = 50

    val GFG = (name:String) => println(s"Company name is $name"+s" and total number of employee is $employee")
    GFG("Momagic")
  }

}
