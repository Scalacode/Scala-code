package Exception

object Ex_throw {
  //Define function
  def validate(article:Int) ={
    if (article < 20)
      throw new ArithmeticException("You are not eligible for internship")
    else
      println("You are eligible for internship")
  }
  def main (args: Array[String]): Unit ={
    validate(19)
  }

}
