import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import io.StdIn._


object signals_try extends App{
  val x2 = Future {println("Hello Future")}//.foreach( z => println(z + "1"))
   Thread.sleep(0)
   var x1 = "Out of future"
   Thread.sleep(2)
   val boolean = println(x1.foreach(x => x + 2))
    
   
   
  /* 
   // map method
  val list = List(1,2)
val one = list.map(x => x*2)    ; println(one)              
val two = list.flatMap(x => Vector(x*2,x+3,x*3)); println(two)
   
   val li = List(1,2,3)
   println(li.foldRight(4)(f))
   def f(x : Int, y: Int): Int = {
     //println("li" + li)
     x+y
   
   }
   Vector
   var v =Vector(1,2,3,4,2); v = v :+ 7
   println(v)
   
   
   
  def job(n: Int) = Future[Int] {
    Thread.sleep(1000)
    println(n) // for demo only as this is side-effecting 
    n + 1
  }
  */
  
  
  
  
  
/*
  val f = for {
    f1 <- job(1)
    f2 <- job(f1)
    f3 <- job(f2)
    f4 <- job(f3)
    f5 <- job(f4)
  } yield List(f1, f2, f3, f4, f5)
  f.map(z => println(s"Done. ${z.size} jobs run"))
  Thread.sleep(6000)
  
  val stream = "Hello"
  var li = List(1,2)
  
  // List OP
   li :+=(3)
  li++=List(4,5)
  println(li)
  
  //Yield
  for(i <- stream ) yield println(i * 3)
  
  //Option
  val o : Option[Int] = Some(1)
  println(o.get)
  
  //varargs ( multiple arguments to a function
 def fun(x : Int*)= { println(x)}
  fun(1,2,3)
  println(stream)
  
  //trait and Mixin
  trait greet{
  
    def say()
   def stop() = println("Stop")
  }
  trait greet1 extends greet{
    def say1() = println("Say 1")
   def stop1() = println("Stop1")
  }
		
  trait greet2{
    def say() = println("Say 3") 
   def stop() = println("Stop3")
  }
		
		
 abstract class gr extends greet with greet1 with greet2{
		override def say() =	println("Say hello")
		
    override def stop() = println("Stop")
	}
 case class gr1() extends gr {
    def factorial(n:Int):Int={
      if(n==1)
      {
        return 1
      }
      var f = n*factorial(n-1)
      return f
    }
    override def say() = println("gr1")
  }
	var g = new gr1()
	g.say
	g.stop
	var x = g.factorial(5)
	println(x)
*/
}