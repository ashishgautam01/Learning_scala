

object patern_match {
  def main(args: Array[String]){
    println("Enter choice 1-3 ")
    var num: Int = scala.io.StdIn.readInt
    print(num)
    def ch(x: Int): String = x match {
      case 0 => "0"
      case 1 => "1"
      case 2 => "2"
      case 3 => "3"
     
    }
  }
}