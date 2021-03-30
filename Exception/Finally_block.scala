package Exception

object Finally_block {

  def main (args: Array[String]): Unit ={

    var arr = new Array[Int](5)
    try{
      var i= arr(5)

      // this statement will never execute
      // as exception is raised by above statement
      println("Inside try block")
    }
    finally {
      println("Finally block is executed")
    }
    // rest program will not execute
    println("Outside try-finally clause")
  }

}
