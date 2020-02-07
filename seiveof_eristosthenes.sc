import scala.collection.mutable.Map

object seiveof_eristosthenes {
   //seive of eratosthenes
    var prime = seive(from(2))
 		println(prime)
 
  def from(x: Int): Stream[Int] ={
    x #:: from(x+1)
  }
  
  def seive(s: Stream[Int]): Stream[Int] ={
      s.head #:: seive(s.tail filter (_ %s.head !=0))
  }
 
}