package exercises
object Scala_String14 {
  def test(stng: String): Int = {
    var l = stng.length();
    var ctr = 0;
    var firsttwo = "li";
    val lastone = "e";
    if (l < 4)
      return 0;
    for (i <- 0 to l - 3) {
      if (firsttwo.compareTo(stng.substring(i, i + 2)) == 0 && lastone
            .compareTo(stng.substring(i + 3, i + 4)) == 0)
        ctr = ctr + 1;
    }
    return ctr;
  }

  def main(args: Array[String]): Unit = {
    val str1 = "live on wild life";
    println("The given string is: " + str1);
    println("The substring life or li?e appear number of times: " + test(str1));
  }
}