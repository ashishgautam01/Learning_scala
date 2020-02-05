
object polymorphism extends App {
      val p = Stream(2,1,3,4)
       println(p)
      var i = new im(2)
      var sw = ("Done")
      var ss = i.addStrng(sw)
      
      
}
  class im(x: Int)
  {
      var q = x +2
      println(q)
    
      def addStrng(s: String)= {
        s.concat("  done") 
        println(s)
    }
  }

