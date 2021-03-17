package  lectures.part1basic

object Expressions extends App {

  val x= 1+2 // Expression
  println("x")

  println(2 + 2 * 4 )

  println(1 == x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable =2
  aVariable +=3 // also work with -= *= /=
  println(aVariable)

  //Instructions(Do) vs Expressions(Value)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  println(if(aCondition) 5 else 3)
  println(1 + 3)

  //Code blocks

  val aCodeBlock ={
    val y=2
    val z=y+1

    if(z > 2) "Hello" else "Goodbye"
  }


}
