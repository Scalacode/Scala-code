package lectures.part1basic

object CBNvsCBV extends App{

  def calledByValue(x: Long): Unit ={

    println("by value: " + x)
    println("by value: " + x)

  }

  def callByName(x: => Long): Unit={
    println("by value: " + x)
    println("by value: "+ x)
  }
  calledByValue(System.nanoTime())
  callByName(System.nanoTime())

}
