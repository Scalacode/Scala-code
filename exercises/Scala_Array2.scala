package Array
object  Scala_Array2 {
  
   def test(nums: Array[Int]) : Boolean = {
    if (nums.length < 1) false 
     else nums.head == nums.last
    }        
  def main(args: Array[String]): Unit = {     
    println("Check fast or last element of a given array are same or not!") 
    var nums1 = Array(1,2,3,4,5,6)
     println("Original Array elements:")
     // Print all the array elements
      for ( x <- nums1 ) {
         print(s"${x}, ")        
       }
      println("\nResult: "+test(nums1))
     var nums2 = Array(1,2,3,4,5,1)
     var n2= 1;
     println("Original Array elements:")
     // Print all the array elements
      for ( x <- nums2 ) {
         print(s"${x}, ")        
       }
      println("\nResult: "+test(nums2))
       }
}
