import scala.util.{Try,Success,Failure}

object error_handle extends App{
 
  def toInt(s: String): Try[Int] = Try(Integer.parseInt(s.trim))
  val x = toInt("asd")
  val y = toInt("12313")
  println(y + "\n"+ x)
  val sa = Try (for(i <-  0 to 2) println(2/i))
  println(sa)
   
  var xxx = readLine()
  println(xxx)
  if (args.size == 0)
      println("Hello, you")
  else
      println("Hello, " + args(0))

val s: String = "asda"
}