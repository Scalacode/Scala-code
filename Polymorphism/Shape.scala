package Polymorphism

class Shape {
  val description:String = "Shape"
}
// creating a sun-class
class shape1 extends Shape{

  // Overriding field using 'override' keyword
  override val description: String = "Shape is circle"

  def display (): Unit ={
    println(description)
  }
}
class shape2 extends  Shape{
  override val description: String = "shape is square"

  def display(): Unit ={
    println(description)
  }
}
object  poly3 extends  App{

  //Creating instances for all
  //  the sub-classes

  val x=new shape1()
  val y=new shape2

  //calling methods
  x.display()
  y.display()
}
