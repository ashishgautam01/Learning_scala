

object substitutionex extends App {
  println("Substitution Example :")
  println(iterate(1,square,4))
  println(square(3))
  def iterate(n: Int, f: Int => Int, x: Int) = {
    if (n == 0) x
    // Below code gives Error Why ??
    //else iterate(n-1, f, f(x))
  }
  def square(x: Int ) =
    x * x    
}