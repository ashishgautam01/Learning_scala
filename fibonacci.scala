

object fibonacci extends App{
  println(fibo(6))
  
  
  def fibo(x: Int):Int ={
     if (x == 0) 0 
     
     else if(x < 3) 1
     
     else fibo(x - 1) + fibo(x - 2)    
  }
  
}