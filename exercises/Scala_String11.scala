package exercises
object Scala_String11 {
  def test(stng: String): String = {
  val len = stng.length;
  var newformstring = "";
  for (i <- 0 to len-1) 
  {
    newformstring += stng.substring(i,i+1);
    if (i > 0 && i < len-1) 
	{
      if (stng.charAt(i-1) == 'z' && stng.charAt(i+1) == 'g')
        newformstring = newformstring.substring(0,newformstring.length()-1);
    }
  }
  newformstring;
  }
  def main(args: Array[String]): Unit = {
      var str1 =  "zzgkitandkatcaketoket";
      println("The given string is: "+str1);
      println("The new string is: "+test(str1));
      
      str1 =  "kitandkazzgtcaketoket";
      println("The given string is: "+str1);
      println("The new string is: "+test(str1));
    
      str1 =  "kitandkatcaketoketzzg";
      println("The given string is: "+str1);
      println("The new string is: "+test(str1));
  }
}