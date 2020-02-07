import scala.collection.mutable.Stack
import Array._

 object finall extends App with stak[Int] {
   
  val st = new Stack[Int]
  st.push(1)
  st.pop()
  
  finall.show()
  finall.push(1)
  finall.push(2)
  finall.push(3)
  finall.show()
  finall.pop()
  finall.show()
}


 trait stak[T] {
  
   var stack = Array[Int]()
   var lvl = 0
   var inc = 0
   def show(x: Int) = s"Done $x"
   
   def push(x: Int) ={    
    stack :+= x      
    inc = lvl + 1 
    var in: Int = inc         
    println("Pushed")
   }
  
   def pop() = { 
     inc = lvl - 1 
     //show(inc)
     println("Popped")
   }
  
  def show(){
     if(inc > 0){
        stack.foreach(println)}
     else println("Empty")
  }
  
  

}