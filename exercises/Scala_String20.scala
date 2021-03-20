package exercises
object Scala_String20 {
  def test(str1: String, c: Char): String = {
    var temp = "";
    for (i <- 0 to str1.length - 1) {
      if (i == 0 && str1.charAt(i) != c)
        temp += str1.charAt(i);
      else if (i == 1 && str1.charAt(i) != c)
        temp += str1.charAt(i);
      else if (i > 1)
        temp += str1.charAt(i);
    }
    return temp;
  }

  def main(args: Array[String]): Unit = {
    var str1 = "aacyte";
    var c = 'a'
    println("The given strings is: " + str1 + ", specified character is: " + c);
    println("The new string is: " + test(str1, c));

    str1 = "bacyte";
    c = 'a'
    println("The given strings is: " + str1 + ", specified character is: " + c);
    println("The new string is: " + test(str1, c));

    str1 = "bbacyte";
    c = 'a'
    println("The given strings is: " + str1 + ", specified character is: " + c);
    println("The new string is: " + test(str1, c));
  }
}