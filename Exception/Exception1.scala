package Exception
import java.io.IOException

object Exception1 extends App{
  try{
    var N=5/0
  }
  catch {
    case a:IOException =>
      {
        println("IOException")
      }
    case b: ArithmeticException =>
      {
        println("ArithmeticException")
      }
  }
}
