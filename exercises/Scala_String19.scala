package exercises
object Scala_String19 {
  def test(str1: String, c: Char): String = {
    var len = str1.length;
    var resultString = "";
    for (i <- 0 to len - 1) {
      if (i == 0 && str1.charAt(i) != c)
        resultString += str1.charAt(i);
      if (i > 0 && str1.charAt(i) != c && str1.charAt(i - 1) != c)
        resultString += str1.charAt(i);
      if (i > 0 && str1.charAt(i) == c && str1.charAt(i - 1) != c)
        resultString = resultString.substring(0, resultString.length() - 1);
    }
    return resultString;
  }
  def main(args: Array[String]): Unit = {
    var str1 = "test#string";
    var c = '#'
    println("The given strings is: " + str1);
    println("The new string is: " + test(str1, c));
    str1 = "sdf$#gyhj#";
    c = '$'
    println("The given strings is: " + str1);
    println("The new string is: " + test(str1, c));
  }
}