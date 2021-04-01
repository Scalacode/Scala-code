package Function

object Carry {

  def add(a:Int) = (b:Int) => a+b

  def main (args: Array[String])
    {
    println(add(10)(50))
  }

}
