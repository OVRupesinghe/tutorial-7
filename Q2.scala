package Assignment7

object Q2 extends App{
  
  val x = new Rational2(3,4)
  val y = new Rational2(5,8)
  val z = new Rational2(2,7)
  println("value of x - y - z is " + (x-y-z)) //should get  -9/56
}


class Rational2(x: Int, y: Int){
    val n = x/gcd(x,y)
    val d = y/gcd(x,y)
    private def gcd(a:Int,b:Int):Int = if (b==0) a else gcd(b,a%b)
    def +(r:Rational2) = new Rational2(this.n*r.d + r.n*this.d, d*r.d)
    def neg = new Rational2(-this.n,this.d) 
    def -(r:Rational2) = this+r.neg
    override def toString = n + "/" + d //This method overrides the inbuilt toString method
  }