

object code_snipet_check extends App{
   var tot = 0;  var su = 0
   val li = List(1, 2, 3, 4)
   println("auto : "+li.sum)   
  
   for(x <- li) { add(x) } 
   def add(x: Int) ={
     
     su = su + x
     tot = su    
   }
   println("Manual : "+su)
}