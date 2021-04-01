package Function

object Function1 {

  def main (args: Array[String]): Unit ={

    println( "sum is :"+functionToAdd(4,8))


  }
  def functionToAdd(a:Int, b:Int):Int =
    {
      var sum:Int = 0
      sum=a+b

      return sum

    }

}
