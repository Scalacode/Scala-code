package exercises
object Scala_String6 {
  def test(m_stng: String, t_stng: String): String = {
  var m_st_len = m_stng.length();
  var t_st_len = t_stng.length();
  var fin = "";
  for (i <- 0 to m_st_len-t_st_len) 
  {
    var tmp = m_stng.substring(i,i+t_st_len);
    if (i > 0 && tmp.equals(t_stng))
      fin += m_stng.substring(i-1,i);
    if (i < m_st_len-t_st_len && tmp.equals(t_stng))
      fin += m_stng.substring(i+t_st_len,i+t_st_len+1);
  }
  fin;
  }

  def main(args: Array[String]): Unit = {
      val str1 =  "weablcoabmeab";
      val str2 =  "ab";	  
      println("The given string are: "+str1+"  and "+str2);
      println("The new string is: "+test(str1, str2));
  }
}