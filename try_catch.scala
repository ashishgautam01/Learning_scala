import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object try_catch extends App{
  val x = List(1,2,3,4)
  val li = Nil
  println(li :: List(2))
  x.foreach(x => x+2)
  
  
  abstract class Try[T]{}
    case class Success[T](x: T) extends Try[T]
    case class failure(ex: Exception) extends Try[Nothing]
  
  try{
    var y = 10/0
    val t =  new FileReader("Hello.txt")
  }
  catch {
    case x : ArithmeticException =>
      {
        println("Diveide By Zero exception\n")
      }
    case y : FileNotFoundException =>
      {
        println("file not found")
      }
    
  }
}