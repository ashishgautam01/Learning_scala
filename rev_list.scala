
// To reverse a list

object rev_list extends App{
  var li = List(1,2,3,4,5)
  var i: Int = 0
  var j: Int = li.length
  println(rev(li))
  
  def rev(l: List[Int]): List[Int] = {
   
    return l.reverse
  }
}