package  lectures.part1basic

object ValueVariableTypes extends App {

  val x =42
  println(x)

  // vals are immutable

  //Compiler can infer types

  val aString: String = "hello"
  val anotherSting = "goodbye"


  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 555555555555555L
  val aFloat: Float = 2.0f
  val aDouble: Double =3.14

  // variables

  var aVariable: Int =4

  aVariable =5 // side effect56


}
