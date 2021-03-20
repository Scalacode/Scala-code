package exercises


  object Scala_String1 {

    def test(str1: String, str2: String): String = {
      // Compare the two strings.
      val result = str1.compareTo(str2);

      // Display the results of the comparison.
      if (result < 0) {
        ("\"" + str1 + "\"" +
          " is less than " +
          "\"" + str2 + "\"");
      } else if (result == 0) {
        ("\"" + str1 + "\"" +
          " is equal to " +
          "\"" + str2 + "\"");
      } else {
        ("\"" + str1 + "\"" +
          " is greater than " +
          "\"" + str2 + "\"");
      }
    }

    def main(args: Array[String]): Unit = {
      var str1 = "This is Exercise 1";
      var str2 = "This is Exercise 2";

      println("String 1: " + str1);
      println("String 2: " + str2);

      var result = test(str1, str2)
      println(result)
      println("========================")
      str1 = "This is Exercise 1";
      str2 = "This is Exercise 1";

      println("String 1: " + str1);
      println("String 2: " + str2);

      result = test(str1, str2)
      println(result)
      println("========================")
      str1 = "This is Blacky";
      str2 = "This is Black";
      println("String 1: " + str1);
      println("String 2: " + str2);
      result = test(str1, str2)
      println(result)
    }


}
