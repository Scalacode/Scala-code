package Function

object Anonymous1 extends  App{

  // Creating anonymous functions
  // without parameter
  var myFun =() => {"Welcome to GeeksFoRgEEKS...!!"}
  println(myFun())

  def myfunction (fun:(String,String)=> String)=
    {
      fun("Dog","Cat")
    }
  // Explicit type declaration of anonymous
  // function in another function
  val f1 = myfunction((Str1: String,Str2:String) => Str1+Str2)

  // Shorthand declaration using wildcard
  var f2 = myfunction(_+_)
  println(f1)
  println(f2)
}
