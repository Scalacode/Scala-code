package exercises
object Scala_String13 {
  def test(main_str: String, sep_str: String, ctr: Int): String = {
    var new_word = "";
    for (i <- 0 to ctr - 1) {
      if (i < ctr - 1)
        new_word = new_word + (main_str + sep_str)
      else
        new_word += main_str;
    }
    return new_word;
  }

  def main(args: Array[String]): Unit = {
    val str1 = "try";
    val str2 = "best";
    var ctr = 3;

    println("The given strings are: " + str1 + "  and  " + str2);
    println("Number to times to be repeat: " + ctr);
    println("The new string is: " + test(str1, str2, ctr));
  }
}