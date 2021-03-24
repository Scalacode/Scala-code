package Array

object ArraySum {
  def main(args: Array[String]): Unit = {
    var nums = Array(1.2, 1.7, 1.12, 1.16, 1.81, 1.99)
    println("Original Array elements:")
    // Print all the array elements
    for ( x <- nums ) {
      print(s"${x}, ")
    }
    println("\nUsing sum():")
    val result = nums.sum
    println(s"Result: ${result}");
  }
}
