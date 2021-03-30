package Exception

object Finally_block2 {
  def main(args:Array[String])
  {
    try
      {
        // create array
        var array = Array(4, 2, 7)
        var b = array(5)
      }
    catch
      {
        // Catch block contain cases.
        case e: ArithmeticException => println(e)
        case ex: Exception => println(ex)
        case th: Throwable=> println("unknown exception"+th)
      }
    finally
    {
      // Finally block will execute
      println("this block always executes")
    }

    // rest program will execute
    println(" rest of code executing")
  }

}
