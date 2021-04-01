package Function

object Anonymous {

  def main (args: Array[String]): Unit =
  {
    var myfunc= (Str1: String ,Str2: String) => Str1+Str2
    var myfunc1 = (_:String, _:String)

    println(myfunc("Geeks","JavaTpoint"))
    println(myfunc1("GeeksforGeeks","Hey you are learning Scala"))
  }

}
