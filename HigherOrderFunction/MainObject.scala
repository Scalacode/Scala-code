package HigherOrderFunction

object MainObject {

  def main (args: Array[String]){

    FunctionExample(25, MultiplyBy5) //Passing a function as a parameter
  }
  def FunctionExample(a:Int, b:Int => AnyVal):Unit = {
    println(b(a))    //calling that function
  }
  def MultiplyBy5(a:Int):Int ={
    a*5
  }

}
