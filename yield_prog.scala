

object yield_prog extends App{

        val a = Array( 8, 3, 1, 6, 4, 5) 
          
        
        var print=for (e <- a if e > 4) yield e 
        for(i<-print) 
        {  
            // Printing result 
            println(i)  
        }  
    
}
