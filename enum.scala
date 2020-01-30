

// Enumeration err

object enum extends Enumeration{
  type Main = Value
  
  val a = Value("hi")
  val b = Value("Sir ji")
  
  def main(args: Array[String]){
    println(s"type values with extend enumeration : $Value")
  }
}