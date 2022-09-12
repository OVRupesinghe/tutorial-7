package Assignment7

object Q1 extends App {
  
  
  val x = new Rational(1,2)
  println("Negative value of "+ x.toString +" is "+x.neg.toString())
    
}


class Rational(x: Int, y: Int){
    def n = x
    def d = y
    def neg = new Rational(-this.n,this.d) 
    override def toString = n + "/" + d //This method overrides the inbuilt toString method
  }