package exercises
object Scala_String8 {
  def test(stng1: String, stng2: String): String = {
    val len1 = stng1.length;
    val len2 = stng2.length;
    var max_len = Math.max(len1, len2);
    var newstring = "";
    for (i <- 0 to max_len - 1) {
      if (i <= len1 - 1)
        newstring = newstring + stng1.substring(i, i + 1);
      if (i <= len2 - 1)
        newstring = newstring + stng2.substring(i, i + 1);
    }
    newstring;
  }

  def main(args: Array[String]): Unit = {
    val str1 = "welcome";
    val str2 = "w3resource";
    println("The given strings  are: " + str1 + "  and  " + str2);
    println("The new string is: " + test(str1, str2));
  }
}