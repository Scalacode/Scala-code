package AbstractClass

abstract  class vehicle {

  //This is an abstract member
  // with undefined implementation

  val category: String

  // A function that is used to print
  // the value of the abstract member

  def car_type: Unit ={
    println(category)
  }
  override def toString= s"The vehicle type is $category"
}
// Now extend the classes bike, car,
// truck and bus and provide values
// for the variable type

class car(name:String) extends  vehicle {

  // assigning the value of
  // the abstract member as car

  val category ="car"
}
class bike (name: String) extends  vehicle {
  val category="bike"
}
class bus (name:String) extends vehicle{
  val category = " bus"
}
  class  truck (name: String) extends  vehicle{
    val category = " truck"
  }
object  AbstractFieldsDemo extends  App
{
  val car= new car("Honda");
  val bike = new bike ("KTM")
  val bus = new bus ("Marcopolo")
  val  truck= new truck("Ashok_Leyland")

  // implementing the function
  // car_type for the object car
  car.car_type
  bus.car_type
  truck.car_type
  bike.car_type

  println(bus)
  println(bike)
  println(truck)
  println(car)
}