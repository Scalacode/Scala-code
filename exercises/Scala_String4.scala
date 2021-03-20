
package exercises
object Scala_String4 {
  def test(stng: String, spc: Char): Boolean = {
    var l = stng.length();
    var char_happy = true;
    for (i <- 0 to l - 1) {
      if (stng.charAt(i) == spc) {
        if (i > 0 && stng.charAt(i - 1) == spc)
          char_happy = true;
        else if (i < l - 1 && stng.charAt(i + 1) == spc)
          char_happy = true;
        else
          char_happy = false;
      }
    }
    char_happy;
  }
  def main(args: Array[String]): Unit = {
    var str1 = "azzlea";
    var spc = 'z'
    println("The given string is: " + str1);
    println("Is " + spc + " happy in the said string: " + test(str1, spc));

    str1 = "abcfdkefg";
    spc = 'f'
    println("The given string is: " + str1);
    println("Is " + spc + " happy in the said string: " + test(str1, spc));
  }
}