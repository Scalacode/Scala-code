package AuxiliaryConstructor

//Primary constructor
class GFG3 (Aname: String, Cname: String) {
  var no: Int = 0

  def display(): Unit = {
    println("Name of the author :" + Aname)
    println("name of the chapter: " + Cname)
    println("Total no of artical:" + no)
  }

  //Auxiliary constructor
  def this(Aname: String,Cname: String, no: Int)
    {
      //Invoking primary constructor
      this(Aname, Cname)
      this.no=no
    }
}
object  main4 extends App{

  //creating object of GFG class
  var obj= new GFG3("aSHISH","cONSTRUCTOR",145)
  obj.display()
}






