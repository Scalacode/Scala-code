package Array
object Scala_Array3
{
  def main(args: Array[String]): Unit = 
 {
   val colors = Array("Red","Blue","Black","Green","White")
   println("Original Array elements:")
   // Print all the array elements
      for ( x <- colors ) {
         print(s"${x}, ")        
       }
   println("\n")
   println("Index of 'Red':", colors.indexOf("Red"))
   println("Index of 'Blue':", colors.indexOf("Blue"))
   println("Index of 'Black':", colors.indexOf("Black"))
   println("Index of 'Green':", colors.indexOf("Green"))
   println("Index of 'White':", colors.indexOf("White"))   
  }
}
