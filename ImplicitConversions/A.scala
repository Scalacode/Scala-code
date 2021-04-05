package ImplicitConversions

import A.fromString
import scala.language.implicitConversions

case class A(s: String)
object A
{
  // Using implicitConversions
  implicit def fromString(s: String): A = A(s)
}

class C
{
  def m1(a: A) = println(a)
  def m(s: String) = m1(s)
}

// Creating object
object C
{
  // Main method
  def main(args: Array[String])
  {
    var b : A = ("GeeksforGeeks")
    println(b)

  }
}
