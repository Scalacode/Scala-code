//Accessing array elements:
package Arrays

object ArraysExample {
  def main(args: Array[String]) {

    var Months = Array("jan", "feb", "mar", "April")
    for (m1 <- Months) {
      println(m1)
    }
    println(Months(1))
  }
}
