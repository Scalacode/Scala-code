package exercises
object Scala_String17 {
  def test(str1: String, n_chr: Int): Boolean = {
    var len = str1.length();
    var pre_str = str1.substring(0, n_chr);
    for (i <- n_chr to len - 1) {
      if (n_chr + i <= len) {
        if (pre_str.equals(str1.substring(i, n_chr + i)))
          return true;
      }
    }
    return false;
  }
  def main(args: Array[String]): Unit = {
    var str1 = "MrsJemsMrsam";
    var n = 3;
    var prechr = str1.substring(0, n);
    println("The given string is: " + str1);
    println("The prefix string length is: " + n);
    println("Is '" + prechr + "' appear else where in the string? " + test(str1, n))
    str1 = "MrJemsam";
    n = 2;
    prechr = str1.substring(0, n);
    println("The given string is: " + str1);
    println("The prefix string length is: " + n);
    println("Is '" + prechr + "' appear else where in the string? " + test(str1, n))
  }
}