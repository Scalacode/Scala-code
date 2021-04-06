package Arrays

object MultidimensionalArrays extends  App {

  val rows = 2
  val cols = 3

  // Declaring Multidimension array
  val name = Array.ofDim[String](rows, cols)

  // Allocating values
  name(0)(0) = "Geeks"
  name(0)(1) = "Scala"
  name(0)(2) = "java"
  name(1)(0) = "Momagic"
  name(1)(1) = "Office"
  name(1)(2) = "Employee"

  for {
    i <- 0 until rows
    j <- 0 until cols
  }
  // Printing values
println(s"($i)($j)=${name(i)(j)}")
}