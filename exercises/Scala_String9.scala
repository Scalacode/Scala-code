package exercises
object Scala_String9 {
  def test(stng: String, str1: String, str2: String): Boolean = {
  val l = stng.length;
  var red = 0;
  var blue = 0;
  for (i <- 0 to l-3) 
  {
    var tmp = stng.substring(i, i+3);
    if (tmp.compareTo(str2) == 0)
      red=red+1; 
     }
  for (i <- 0 to l-4) 
  {
    var tmp = stng.substring(i, i+4);
    if (tmp.compareTo(str1) == 0)
      blue=blue+1; 
  }
  
  if (red == blue)
    return true;
  else
    return false;
  }
  
  def main(args: Array[String]): Unit = {
      var strr =  "redcapmanwithbluecar";
      val str1 = "blue";  
      val str2 = "red";    
      println("The original string is: "+strr);
      println("Searched strings are: "+str1+","+str2);
      println("The appearance of red and blue are same: "+test(strr, str1, str2));
      strr =  "redcapmanwithbluecarblue";
      println("The original string is: "+strr);
      println("Searched strings are: "+str1+","+str2);
      println("The appearance of red and blue are same: "+test(strr, str1, str2));
    
 }
}