object Tester {
  println("Welcome to the Scala worksheet")
   
   def main(args: Array[String]){
		println(func(19))
		println("main")
		println(math.area(2))
		
		maths(2,_ + _)
		
		var number =9
		val ads = (x : Int) => x + number ; // impure closure ( var )
		
		def a1(x : Int,x2: Int) =x + x2
		def a2(y: Int) = (y1: Int) => y + y1
		
		println(a2(2)(_))// Currying
		
		val arr: Array[Int] = new Array[Int](5);
		val arr1 = new Array[Int](5);
		println(arr.length)
		
		val li = List(1,2,3)
		println(li.length)
		println( 0 :: li)
		println(0 :: Nil)
		li.head; li.tail;
//		li.foreach( println("list"))
		
		
		val myset = Set(1,2,3,4)
		val mymap = Map(1 -> "A", 2 -> "B" )
		mymap(2)
		mymap.contains(2)
		
		val tuple = new Tuple4(1,2,"Hello", true)
		println(tuple._2)
		
		//var a = x  => x + 2 !== 0;
		
	}
	
	def maths(x: Int, f: (Int,Int) => Int): Int ={
		println("maths")
		x
	}
	
val x = {var a: Int =10; var b : Int = 20}
lazy val c =20;
val name = "ash"

println(f"$c%d ")
println(s"name $name")

val res = if(c > 2) "9";
println(res)

var q = 0
for ( i <- name ){
	for(q <- 1 to 6){
						for( i <- 1 until 3){						}	}}
						
for{i <- 1 to 2; if i<3} yield { i+1 }
		println(q)
		
		val age =10
		age match {
			case 12 | 10 => println("Correct age ")
		}
		
	def func(x :Int): Int = {
		println("func")
		x +1
	}
	
	object math{
		def area (x : Int): Int ={
			return x * x
		}
	}
	
	
}