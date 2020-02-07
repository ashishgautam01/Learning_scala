

object Loop extends App{
  var x: Int = 1
  for (i <- 1 to 5){ println(x*x); x = x + 1 }
}