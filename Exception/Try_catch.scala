package Exception

object Try_catch {

  def main (args: Array[String]): Unit ={

    try{
      var N=10/0
    }
    catch {


      case a: ArithmeticException =>
        println("A number can never divided by zero")

    }
  }

}
