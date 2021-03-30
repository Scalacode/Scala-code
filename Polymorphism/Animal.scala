package Polymorphism

//class animal
class Animal {
  //Creating a variable with 'var' keyword
  val number:Int = 5
}
//Creating a subclass
class Cat extends  Animal{

  //Overriding field using
  // 'override' keyword

  override val number: Int = 8

  //method
  def show(): Unit ={
    println(" we have "+number + " cats.")
  }
}
object  poly5 extends  App{

  //Overriding field using
  //    // 'override' keyword
  var x=new Cat()
  x.show()
}
