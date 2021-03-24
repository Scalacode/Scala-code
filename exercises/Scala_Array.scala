package Array

object Scala_Array {
   def test(x:Int, nums: Array[Int]) : Boolean = {
    if (nums.length < 1) false 
     else nums.head == x || nums.last == x
    }     
   def main(args: Array[String]): Unit = { 
     println("Check if a given number is present in fast or last position in an array!")
     var nums1 = Array(1,2,3,4,5,6)
     var n1 = 5;
     println(s"Given number: ${n1}")
     println("Original Array elements:")
     // Print all the array elements
      for ( x <- nums1 ) {
         print(s"${x}, ")        
       }
      println("\nResult: "+test(n1, nums1))
     var nums2 = Array(1,2,3,4,5,1)
     var n2= 1;
     println(s"Given number: ${n2}")
     println("Original Array elements:")
     // Print all the array elements
      for ( x <- nums2 ) {
         print(s"${x}, ")        
       }
      println("\nResult: "+test(n2, nums2))
   }
}
