

object yield_prog extends App{
//Yield Try
        val a = Array( 8, 3, 1, 6, 4, 5) 
          
        
        var print=for (e <- a if e > 4) yield e 
        for(i<-print) 
        {  
            // Printing result 
            println(i)  
        }  
  
  
 
	trait Generator[+T]
	{
		def generate : T
	}
	
	val integers = new Generator[Int]
	{
		val rand = new java.util.Random
		def generate = rand.nextInt()
		println(generate)
	}

	//Boolean generator
	val booleans = new Generator[Boolean] {
		def generate = integers.generate > 0
		println(generate)
	}
	//can also be done as
	/*
	val bool = for(x <- integers) yield x>0
	println(bool)
	*/
	
	val pairs = new Generator[(Int,Int)] {
		def generate = (integers.generate, integers.generate)
		println(generate)
	
	}
/*	def lists: Generator[List[Int]] = for {
    isEmpty <- booleans
    list <- if (isEmpty) emptyLists else nonEmptyLists
} yield list

def emptyLists = List(0)

def nonEmptyLists = for {
    head <- integers
    tail <- lists
} yield head :: tail
	
	*/

}
