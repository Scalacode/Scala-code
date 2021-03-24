package Array

object Scala_Array7 {

 def min_max(a: Array[Int]) : (Int, Int) = {
     if (a.isEmpty) throw new IllegalArgumentException("Blank Array...!")
    a.foldLeft((a(0), a(0)))
    { case ((min, max), e) => (math.min(min, e), math.max(max, e))}
     }
  
     
   def main(args: Array[String]): Unit = {
        val nums1 = Array(1, 2, 3, 4, 5, 7, 9, 11, 14, 12, 16)        
        println("Original Array elements:")
        // Print all the array elements
        for ( x <- nums1 ) {
         print(s"${x}, ")        
          }
        println("\nMaximum - Minimum value of the said array: " +min_max(nums1));
        val nums2 = Array(-111,-124)        
        println("Original Array elements:")
        // Print all the array elements
        for ( x <- nums2 ) {
         print(s"${x}, ")        
          }
        println("\nMaximum - Minimum value of the said array: " +min_max(nums2));
        
        val nums3 = Array(10)        
        println("Original Array elements:")
        // Print all the array elements
        for ( x <- nums3 ) {
         print(s"${x}, ")        
          }
        println("\nMaximum - Minimum value of the said array: " +min_max(nums3));
        var nums4 : Array[Int] = Array()
        println("Result: " +min_max(nums4));
         
      } 
 } 
