package NestedFunction

object MaxAndMin {

  def main (args: Array[String]): Unit ={

    println("Max and Min from 5, 7")
    maxAndMin(5,7)
  }
  //function
  def maxAndMin(a:Int ,b:Int) ={

    //Nested Function
    def maxvalue()={
      if(a>b){
        println("Max is :"+a)
      }
      else{
        println("Max is :"+b)
      }
    }
    //Nested function
    def minvalue()={
      if(a<b){
        println("Min is:"+a)
      }
      else{
        println("Min is:"+b)
      }
    }
    maxvalue()
    minvalue()


  }

}
