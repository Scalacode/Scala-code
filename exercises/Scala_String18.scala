package exercises
object Scala_String18 {
  def test(str1: String, str2: String): Boolean = {
    var stng1 = str1.toLowerCase();
    var aLen = str1.length;
    var stng2 = str2.toLowerCase;
    var bLen = stng2.length();
    if (aLen < bLen) {
      var temp = stng2.substring(bLen - aLen, bLen);
      if (temp.compareTo(stng1) == 0)
        true;
      else
        false;
    } else {
      var temp = stng1.substring(aLen - bLen, aLen);
      if (temp.compareTo(stng2) == 0)
        true;
      else
        false;
    }
  }
  def main(args: Array[String]): Unit = {
    var str1 = "pqrxyz";
    var str2 = "xyz";
    println("The given strings are: " + str1 + "  and " + str2);
    println("Is one string appears at the end of other? " + test(str1, str2));

    str1 = "pqrxyz";
    str2 = "rxy";
    println("The given strings are: " + str1 + "  and " + str2);
    println("Is one string appears at the end of other? " + test(str1, str2));
  }
}