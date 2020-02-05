import scala.concurrent.Future


object bankaccount {
	private var balance = 0.0
	var depval: Double = _
	var con: Int = _
	var limit = 50
	
	def Bank(con: Int): Unit = {		 
		  var con1 = con
	    println("Enter choice : \n1 Show Balance \n2 Deposit \n3 Withdraw\n\n ")
		  var x: Int = scala.io.StdIn.readInt()
		  
		  do{
		    choice(x)
		    
		    def choice(ch: Int) = ch match {
		      
		      case 1 => showbal()
		                cont()
		      case 2 => Deposit(depval)
		                cont()
		      case 3 => println("Enter Value to withdraw :\n") 
		                val withval: Double = scala.io.StdIn.readInt()
		                withdraw(withval)
		                cont()
		      case _ => println("Error : Wrong Option Taken.")
		                cont()
		                
	               
		      
		    }
		  }while(con1 == 1);
		  println("Thank you for using our instant bank:")
	 }	 
	
	def showbal()  = {
	  println("Current Balance is :"+ balance)
	  cont()
	}
	
	  def withdraw(amount: Double): Unit = {
	  if( balance < 1 ) {
	    println("Low Balance\n1")
	    showbal()
    } 
	  else {
     balance = balance - amount
    }
	 }
	    
	def Deposit(depval: Double): Unit = {
	 
		if ( balance < depval ) {
			println("Balance Low\n")
			cont()
			}
		else {
		  println("Enter value to deposit :\n")
		  var depval = scala.io.StdIn.readInt()
			balance = balance + depval
		}
	}
	
	def cont(): Unit = {
	  for(i <- 0 to limit)
	    if (i == 0) 
	      Bank(con)
	    else {
	      println("Continue ? 1(yes) / 2(No)\n ")
	      var con =scala.io.StdIn.readInt()
	      Bank(con)
	    }
	}
	
	
	def main(args: Array[String]){
	  cont()  
	}		
}
