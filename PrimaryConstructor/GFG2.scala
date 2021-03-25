package PrimaryConstructor

class GFG2 (val Aname: String = "Ashish",
            val Cname: String = "Constructor")
{

  def show() ={
    println("Name of the employe: "+Aname)
    println("Constructor name is nothing but :" + Cname)
  }
}
object  main1 extends App{
  val obj= new GFG2();
  obj.show()

}
