

object signals_try extends App{
  trait greet{
    def say()
   def stop() = println("Stop")
  }
  trait greet1{
    def say() = println("Say 1")
   def stop() = println("Stop1")
  }
		
  trait greet2{
    def say() = println("Say 3") 
   def stop() = println("Stop3")
  }
		
		
 abstract class gr extends greet with greet1 with greet2{
		override def say() =	println("Say hello")
		
    override def stop() = println("Stop")
	}
  class gr1 extends gr {
    
  }
	var g = new gr1
	g.say
	g.stop
	

}