
//Updating an element in array
package Arrays

object ArrayExample2 extends  App {

  val names=Array("aSHISH","Niraj","Hari","Anand","Aranv")
  println("Orignal name : ")
  for(z <- names){
    println(z)
    println()
  }
//  Updating an element in an array
  names(2)="Riya"
  for(z<- names){

    println(z)
  }

}
