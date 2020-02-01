//Digital Circuit implementation

object dig_cir extends Wire{
  def main(args: Array[String]){
  var p, q, r, sum, carry, cin, sumf, cout = new Wire
  
  println("We Have 3 wires for now: \n")
  r.setSignal(true)
  p.setSignal(false)
  q.setSignal(false)
  println("Signal value of wire 1 : "+ p.getSignal)
  println("Signal value of wire 2 : "+ q.getSignal) 
  println("Signal value of wire 3 : "+ r.getSignal) 
  
  andGate(p,q,r)
  orGate(p,q,r)
  notGate(p,r)
  
  // Half Adder Part
  
  p.setSignal(true)
  q.setSignal(false)
  
  println("Half Adder Result : \t")
  halfAdder(p,q,sum,carry)
  
  // Full Adder Part
  p.setSignal(true)
  q.setSignal(false)
  cin.setSignal(false)
  fullAdder(p,q,cin , sumf ,cout)
}
}
class Wire {
  var sigVal = true
 
  def getSignal: Boolean = sigVal
  
  def setSignal(x: Boolean): Unit ={
    sigVal = x
  }
  
  def notGate(input: Wire, output: Wire): Unit ={
 
        
        output.setSignal(!input.sigVal)
        println("Not value : " + output.sigVal)
  }
  
def orGate(a: Wire, b: Wire, z: Wire): Unit ={
   val x = a.getSignal
    val y = b.getSignal
    z.setSignal(x | y)
    println("OR = " + z.getSignal)
}

def halfAdder(a: Wire, b: Wire, sum: Wire, carry: Wire): Unit = {
    val d = new Wire
    val e = new Wire
    orGate(a, b, d)
   
    andGate(a, b, carry)
   
    notGate(carry, e)
    
    andGate(d, e, sum)
    println("\nSum = "+ sum.getSignal + "\nCarry = " + carry.getSignal)
}

def fullAdder(a: Wire, b: Wire, cin: Wire, sum: Wire, cout: Wire): Unit = {
    val s = new Wire
    val c1 = new Wire
    val c2 = new Wire
    halfAdder(b, cin, s, c1)
    halfAdder(a, s, sum, c2)
    orGate(c1, c2, cout)
    println("Full Ader result : sum = " + sum.getSignal + "\ncarry = " + cout.getSignal )
}
  def andGate(a: Wire, b: Wire,c: Wire): Unit ={
    val x = a.getSignal
    val y = b.getSignal
    
    c.setSignal(x & y)
    println("AND : " + c.getSignal)
  }
}  
