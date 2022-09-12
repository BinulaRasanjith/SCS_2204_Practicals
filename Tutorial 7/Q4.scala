object Q4 extends App {
  val account1= new BankAccount("John", 1111, 10000.00)
  val account2= new BankAccount("Doyle", 2222, 5000.00)
  val account3= new BankAccount("Martin", 3333, 2000.00)
  val account4= new BankAccount("Vicky", 4444, -3000.00)

  var bank:List[BankAccount]=List(account1, account2, account3, account4)

  val negBalance = bank.filter((a) => a.balance<0)
  val totalBalance = bank.map((a) => (a.balance)).reduce((a,b) => {a+b})
  val interest = (bank: List[BankAccount]) => bank.map((a) => ( a.ID, a.accountnumber, if(a.balance>0) (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("Accounts with negative balance: ")
  println(negBalance)
  print("Sum of all account balances: ")
  println(totalBalance)
  print("Final balances with interest: ")
  println(interest(bank))
}

class BankAccount(id: String, n: Int, b: Double) {
  var ID: String = id
  var accountnumber: Int = n
  var balance: Double = b

  override def toString = "["+ID+": "+ accountnumber +": "+ balance +"]"
}
