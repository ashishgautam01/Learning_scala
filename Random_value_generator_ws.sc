object Random_value_generator_ws {

	trait Generator[+T]
	{
		def generate : T
	}
	
	val integers = new Generator[Int]
	{
		val rand = new scala.util.Random
		def generate = rand.nextInt()
		println(generate)
	}                                         //> -24721607
                                                  //| integers  : Random_value_generator_ws.Generator[Int]{val rand: scala.util.Ra
                                                  //| ndom} = Random_value_generator_ws$$anon$1@7f63425a

	//Boolean generator
	val booleans = new Generator[Boolean] {
		def generate = integers.generate > 0
		println(generate)
	}                                         //> false
                                                  //| booleans  : Random_value_generator_ws.Generator[Boolean] = Random_value_gene
                                                  //| rator_ws$$anon$2@36d64342
	//can also be done as
	
	/*val bool = for(x <- integers) yield x>0
	println(bool)
	*/
	val pairs = new Generator[(Int,Int)] {
		def generate = (integers.generate, integers.generate)
		println(generate)
	
	}                                         //> (-1368036102,284456527)
                                                  //| pairs  : Random_value_generator_ws.Generator[(Int, Int)] = Random_value_gene
                                                  //| rator_ws$$anon$3@1e67b872
/*	val lists = new Generator[List[Int]]{
			
		for ( li <- integers) yield li
		//println(li)
	}
	
	*/
}