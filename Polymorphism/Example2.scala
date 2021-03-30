package Polymorphism

class Example2 {
  def func(vehicle: String , category: String): Unit ={
    println("The vehicle is: "+vehicle)
  }
  def func(Name: String , Marks: Int): Unit ={
    println("Name of the person: "+Name)
    println("Marks of the person: "+Int)
  }
  def func(a: Int, b: Int, c: Int): Unit =
  {
    var sum = a+b+c
    println("sum is: "+sum)
  }
}
object poly2 extends  App{
  var py=new Example2()
  py.func("Honda","Bike")
  py.func("Ashish" , 51)
  py.func(10,20,70)

}
