
//Print Last Second Element of a list

object lastbutone extends App{
  var li = List(1,2,3,4,5)
  var i: Int = 0
  var len = li.length
  var lst : Int = 0
  
  for ( i <- li ){
    if(i == len )
      lst = i - 1     
      i + 1
  } 
   println("Last Second Value is :" + lst )
}