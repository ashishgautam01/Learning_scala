

object yield_prog extends App{
  var num = scala.io.StdIn.readInt()
  var i = 0 
  var x = (1,2,3,4)
  var r = for(i <- x if i > 2) yield i 
    i + 1
  
  println(r)
}