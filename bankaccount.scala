
object bankaccount {
	private var balance = 0
	var depval: Int = _
	var con: Int = _
	
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
		      case 3 => println("Enter Vakue to withdraw :\n") 
		                val withval: Int = scala.io.StdIn.readInt()
		                withdraw(withval)
		                cont()
		      case _ => println("Error")
		                cont()
		                
	               
		      
		    }
		  }while(con1 == 0);
		  println("Thank you for using our instant bank:")
	 }	 
	
	def showbal()  = {
	  println("Current Balance is :"+ balance)
	  cont()
	}
	
	  def withdraw(amount: Int): Unit = {
	  if( balance < 1 ) {
	    println("Low Balance")
	    showbal()
    } 
	  else {
     balance = balance - amount
    }
	 }
	    
	def Deposit(depval: Int): Unit = {
	 
		if ( balance < depval ) {
			println("Balance Low")
			cont()
			}
		else {
		  println("Enter value to deposit :")
		  var depval = scala.io.StdIn.readInt()
			balance = balance + depval
		}
	}
	
	def cont(): Unit = {
	  println("Continue ? 0(yes) / 1(No)\n ")
	  var con =scala.io.StdIn.readInt()
	  Bank(con)
	  
	  
	}
	
	def main(args: Array[String]){
	  cont()  
	}		
}
