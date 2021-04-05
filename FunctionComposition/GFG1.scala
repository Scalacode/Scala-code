package FunctionComposition

object GFG1
{
  // Main method
  def main(args: Array[String])
  {
    println((add andThen mul)(2))

    // Adding more methods
    println((add andThen mul andThen sub)(2))
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