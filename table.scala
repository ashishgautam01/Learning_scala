

object table extends App{
  println("Table of on;ly integers + : ")
  val o = readInt()
  println("Limit till : ")
  val c = readInt()
  shower(o,c)
  
  def shower(num: Int, limit: Int) ={
    for(i <- 1 to limit) println(num + "*"+ i+ "= "+ i * num) 
    
    
  }
}