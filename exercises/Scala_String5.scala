package exercises
object Scala_String5 {
  def test(stng: String): Int = {
  var l = stng.length();
  var ctr = 0;
  for (i <- 0 to l-3)
  {
    var tmp = stng.charAt(i);
    if (tmp == stng.charAt(i+1) && tmp == stng.charAt(i+2))
      ctr=ctr+1;
  }
  return ctr;
  }

  def main(args: Array[String]): Unit = {
      val str1 =  "welllcommmmeee";
      println("The given string is: "+str1);
      println("The number of triples in the string is: "+test(str1));
  }
}