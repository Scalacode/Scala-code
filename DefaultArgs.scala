package  lectures.part1basic

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1,n*acc)

  val fact10 = trFact(10,2)

  def savePicture(formate: String = "jpg", width: Int= 1920, height: Int=1000): Unit = println("saving picture")
  savePicture(width = 800)

}
