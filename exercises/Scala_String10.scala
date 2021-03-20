package exercises
object Scala_String10
 {
  def test(stng: String, schar: Char): Boolean = {
    var l = stng.length;
    var found = true;
    var tmpString: Char = ' '
    for (i <- 0 to l - 1) {
      tmpString = stng(i)
      if (tmpString.compare(schar) == 0) {
        if (stng.charAt(i - 1) == stng.charAt(i + 1)) {
          found = true;
        } else {
          found = false;

        }
      }
    }
    found;
  }
  
  def main(args: Array[String]): Unit = {
    var str1 = "moon#night";
    var schar: Char = '#'
    println("The given string is: " + str1 + " and the specified character is: " + schar);
    println("The before and after " + schar + " both characters are same in the said string: " + test(str1,schar));
    str1 = " bat#$#ball"
    schar = '$'
    println("The given string is: " + str1 + " and the specified character is: " + schar);
    println("The before and after " + schar + " both characters are same in the said string: " + test(str1,schar))
    str1 = " bat#$ball"
    schar = '$'
    println("The given string is: " + str1 + " and the specified character is: " + schar);
    println("The before and after " + schar + " both characters are same in the said string: " + test(str1,schar))
  }
 }