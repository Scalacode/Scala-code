package AuxiliaryConstructor

// Primary constructor
class SuperClassConstructor (var mesage: String="hEY HOW ARE YOU ")
{
  println(mesage)
}
//Calling the super class constructor
class  subclass (Aname: String = "Ashish", Number: Any = 56) extends SuperClassConstructor{
  def display(): Unit = {


    println("Name is nothing but :" + Aname)
    println("Number is :" + Number)
  }
}
object main5 {

  def main (args: Array[String]): Unit =
  {
    // creating object of subclass

    var obj= new subclass("Hey")
    obj.display();
  }


}