package Array
object Scala_Array1 {
   def main(args: Array[String]): Unit = {
     var nums = Array(1, 2, 3, 4, 5, 6)
     println("Original Array elements:")
     // Print all the array elements
      for ( x <- nums ) {
         print(s"${x}, ")        
       }
     //Sum using for loop
     var total = 0.0;      
      for ( i <- 0 to (nums.length - 1)) {
         total += nums(i);
      }
      println(s"\nAverage value of the array elements is: ${total/nums.length}");
   }
}
