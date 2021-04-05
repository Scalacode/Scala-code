package FunctionComposition
object GFG3
{
  // Main method
  def main(args: Array[String])
  {
    println(add(mul(2)))

    // Adding more methods
    println(add(mul(sub(2))))
  }

  val add=(a: Int)=> {
    a + 1
  }

  val mul=(a: Int)=> {
    a * 2
  }

  val sub=(a: Int) =>{
    a - 1
  }
}