package PrimaryConstructor

class GFG (Aname: String, Cname: String, Particle: String){
  def display(): Unit =
  {
    println("Author name: " +Aname )
    println("Chapter name: " +Cname )
    println("Total published articles: " +Particle )
  }
}
object Main extends  App{
  //def main (args: Array[String]){

var obj=new GFG("Ashish","Momagic","145")
  obj.display()
//}
}