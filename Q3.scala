package Assignment7

object Q3 extends App{
  val a = new Account2("0001",20001,20000.00)
  val b = new Account2("0002",20002,20000.00)
  println("Accounts before transfer:")
  println(a)
  println(b)
  a.transfer(b, 10000)
  println("Accounts after transfer")
  println(a)
  println(b)
}

class Account2(id:String,n:Int,b:Double){
  val nic:String = id
  val acnumber: Int = n
  var balance: Double = b
  def withdraw(a:Double) = this.balance = this.balance-a
  def deposit(a:Double) =  this.balance = this.balance+a
  def transfer(a:Account2,b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  
  override def toString = "["+nic+":"+acnumber+":"+balance+"]"
}
