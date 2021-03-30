package Exception

object GFG6 {

  def main (args: Array[String]): Unit ={

    try{
      func()
    }
    catch {
      case a:Exception => println("Exception caught in main: "+a)
    }
  }
  def func(): Unit ={

    // Using throw exception
     throw  new Exception("Exception throws from func")
  }

}
