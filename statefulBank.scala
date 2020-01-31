

// Misc for a proxy call

class BankProxy(x : Int) {
  
 var balance : Int = _
  
  def add(){
    balance = balance +1
    deposit(1)
  }
  def deposit(x: Int): Unit = {
   println("Diposited 0"+ balance ) 
  
  }
}
object statefulBank extends App{
  var x = new BankProxy(10)
  for (i <- 1 until 3; j <- "abc") println(i + " " + j)
  x.add() 
  x.add()
}
