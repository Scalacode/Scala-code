package Arrays
import  Array._
object ConcatenateArrays extends  App {

  var Arr1= Array(1,2,3,4,5)
  var Arr2 = Array(0,9,8,7,6)
  var Arr3 = concat(Arr1,Arr2)

  for(x<-Arr3){
    println(x)
  }
}
