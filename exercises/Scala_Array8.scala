package Array

object Scala_Array8 {

  def sum_last_3(arr: Array[Int]): Int = {
     if (arr.length < 1) 0 
     else if (arr.length > 0  && arr.length < 3) arr.takeRight(2).sum
     else arr.takeRight(3).sum
  }
     
   def main(args: Array[String]): Unit = {
        val nums1 = Array(1, 2, 3, 4, 5, 7, 9, 11, 14, 12, 16)        
        println("Original Array elements:")
        // Print all the array elements
        for ( x <- nums1 ) {
         print(s"${x}, ")        
          }
      println("\nSum of the last 3 elements of the said array: "+sum_last_3(nums1))
      
       val nums2 = Array(12, 16)        
        println("Original Array elements:")
        // Print all the array elements
        for ( x <- nums2 ) {
         print(s"${x}, ")        
          }
         println("\nSum of the last 2 elements of the said array: "+sum_last_3(nums2))   
     
        var nums4 : Array[Int] = Array()
        println("\nSum of the blank array: "+sum_last_3(nums4))   

      } 
 }
