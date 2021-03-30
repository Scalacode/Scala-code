package Exception

import java.io.FileReader
import  java.io.FileNotFoundException
import  java.io.IOException

object Arithmetic {

  def main(args:Array[String]): Unit ={

    try{
      val t = new FileReader("Input.txt")
    }
    catch{
      case x:FileNotFoundException => println("Exception: File is missing")
      case x:IOException => println("Exception: Input/output ")
    }
  }

}
