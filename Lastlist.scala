

object Lastlist extends App {
  var li: List[Int] = List(1,2,3,4)
  var x: Int = 0
  
  li.foreach { x = _ }   
  
  println(x)
}