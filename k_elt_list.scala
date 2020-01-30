
//Find the nth Element from a list

object k_elt_list extends App{
  var li = List(1,2,3,4,5)
  println("Enter Position\n")
  var pos: Int = scala.io.StdIn.readInt
  var i: Int = 0
  var len: Int = li.length
  println("Length of the List is :" + len)
  for(i <- li){
    if ( i == pos ){
      println("Element at "+ pos +" is :" + li(pos))
    }
    
  }
}