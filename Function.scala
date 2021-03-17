package  lectures.part1basic

object Function extends  App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction())


  def aRepeatedFunction(aString: String, n:Int): String = {
    if (n== 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("HELLO",3))

  //wHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit= println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int,b: Int ):Int = a+b

    aSmallFunction(n,n-1)
  }

  //1. A greeting function (name, age) =>

  def greetingForKids(name: String, age: Int): String =
  "Hi, my name is " + name + " and I am " + age + " years old."
  println(greetingForKids("ASHISH",20))

  //fACTORIAL fUNCTION 1*2*3*4....*n

  def factorial(n: Int): Int =
    if(n <= 0) 1
    else n * factorial(n-1)

  println(factorial(6))

}
