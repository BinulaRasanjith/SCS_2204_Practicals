object Q3 extends App {

  val account1 = new Account("John", 1111, 10000.00)
  val account2 = new Account("Doyle", 2222, 5000.00)

  println("Balances before money transfer")
  println(account1)
  println(account2)
  println()

  // Money transfer
  account1.transfer(account2, 5000.00)

  println("Balances after money transfer")
  println(account1)
  println(account2)
}

class Account(id: String, n: Int, b: Double) {
  var ID: String = id
  var accountNumber: Int = n
  var balance: Double = b

  def withdraw(n: Double) = {
    this.balance = this.balance - n
  }

  def deposit(n: Double) = {
    this.balance = this.balance + n
  }

  def transfer(acc: Account, n: Double) = {
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "[" + ID + ": " + accountNumber + ": " + balance + "]"
}
