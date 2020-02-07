object isprime {
 

 def isprime(x: Int) = {
   var count = 0; var d = 0
   for(i <- 2 until x ){
   		if(x % i == 0){
   			d = count + 1
   		}
 	 }
 	 if(d == 0 ) println("Prime")
 	 else println("Not Prime")
 }                                                //> isprime: (x: Int)Unit
 isprime(29)                                      //> Prime
}