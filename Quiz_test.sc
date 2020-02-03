object Quiz_test {
	
	trait greet{ def say(); 	def stop() = println("Stop");	}
		
	class gr extends greet{
		def say(){
		println("Say hello")
		}
		def stop()
	}
	var g = new gr
	g.say()
	//curry
	def add(x: Int)=(y: Int) => println(x+y)
	
	var addvar = add(1)(_)
	println(addvar(2))
}