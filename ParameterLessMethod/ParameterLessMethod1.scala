package ParameterLessMethod

class ParameterLessMethod1(name: String, ar: Int) {

  //A parameterless method
   def author=println(name)
   def artical= println(ar)

  // An empty-parenthesis method
  def printInformation()={
    println("User ->"+name +",Artical ->"+ar)
  }
}
object Parameterlass extends  App{

  var GFG=new ParameterLessMethod1("Ashish",78)
  GFG.author
  GFG.artical
}
