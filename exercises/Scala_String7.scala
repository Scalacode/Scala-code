package exercises
object Scala_String7 {
  def test(stng: String, n: Int): String = {
  var l = n
  var newstring = "";
    
  for (i<-n to 0 by -1)
  {
    newstring = newstring + stng.substring(0,l);
    l = l -1;
  }
  return newstring;
  }

  def main(args: Array[String]): Unit = {
     val str1 =  "welcome";
	   val rep_no=4;
     println("The given string is: "+str1);
	   println("Number of repetition characters and repetition: "+rep_no);
     println("The new string is: "+ test(str1, rep_no));
  }
}