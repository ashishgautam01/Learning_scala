import java.util.Random

object streams extends App{
  val st =Stream(1,2,3,4,1000)
  val st1=Stream("hi","hello","jai ho")
  
  //Manipulation
  val st2 = Stream from 0 
  def multiple_two() = {var m2 = st2.map(_ + 10)
    println(m2)}
  var x1 = multiple_two
  
  //Methods
  println(st.head)              //1
  println(st.tail.head)         //2
  println(st1.tail)             //hello,?
  println(st.head != 2)         //true
  println(st1 #:: st); println(Stream.cons(st,st1))
  
  //Lazy Evaluation with Lazy variables
  lazy val x = { if(2 >1) println("Hello") else 3  }
  println(x match {
    case () => println("match was good")
    case 3 => println("Noneeeeee")
  })
  
 
}

