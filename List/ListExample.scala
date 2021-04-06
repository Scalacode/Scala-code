package List

import  scala.collection.immutable._
object ListExample {

  def main(args:Array[String])
  {
    // Creating and initializing immutable lists
    val mylist1: List[String] = List("Geeks", "GFG",
      "GeeksforGeeks", "Geek123")
    val mylist2 = List("Ashish", "Momagic", "Cetpa", "JP",
      "AKTU")

    // Display the value of mylist1
    println("List 1:")
    println(mylist1)

    // Display the value of mylist2 using for loop
    println("\nList 2:")
    for(mylist<-mylist2)
    {
      println(mylist)
    }
  }

}
