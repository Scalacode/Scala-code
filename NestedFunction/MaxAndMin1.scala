package NestedFunction

object MaxAndMin1 {

  def main(args: Array[String]): Unit ={
    fun();
  }
  //Function

  def fun() ={
    geeks()

    //1st nested function

    def geeks() ={
      println("Learning Scala is easy from geeks")

      GFG()

      // second nested function
      def GFG() ={
        println("GFG")

        gaming()
        //3rd nested function
        def gaming() ={
          println("wana paly game")
        }
      }
    }
  }

}
