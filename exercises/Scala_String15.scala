package exercises
object Scala_String15 {
  def test(str1: String, str2: String): Boolean = {
    var l = str1.length
    var mid_pos = l / 2;
    if (l < 3)
      false
    if (l % 2 != 0) {
      if (str2.equals(str1.substring(mid_pos - 1, mid_pos + 2))) {
        true
      } else {
        false
      }
    } else if (str2.equals(str1.substring(mid_pos - 1, mid_pos + 2)) || str2
                 .equals(str1.substring(mid_pos - 2, mid_pos + 1))) {
      true
    } else
      false
  }

  def main(args: Array[String]): Unit = {
    val str2 = "abc"
    var str1 = "wwabcwww";
    println("The given string is: " + str1);
    println("Is " + str2 + " appear in middle? " + test(str1, str2));

    str1 = "wwwabcwww";
    println("The given string is: " + str1);
    println("Is " + str2 + " appear in middle? " + test(str1, str2));

    str1 = "wwwwabcwww";
    println("The given string is: " + str1);
    println("Is " + str2 + " appear in middle? " + test(str1, str2));

    str1 = "wwwwwabcwww";
    println("The given string is: " + str1);
    println("Is " + str2 + " appear in middle? " + test(str1, str2));
  }
}