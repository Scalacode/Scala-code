package exercises
object Scala_String12 {
  def test(stng: String, no_repeat: Int): String = {
    val l = stng.length;
    var new_word = "";
    for (i <- 0 to no_repeat - 1) {
      new_word += stng.substring(l - no_repeat, l);
    }
    new_word;
  }

  def main(args: Array[String]): Unit = {
    val str1 = "string";
    val no_char = 3;
    println("The given string is: " + str1);
    println("The new string after repetition: " + test(str1, no_char));
  }
}