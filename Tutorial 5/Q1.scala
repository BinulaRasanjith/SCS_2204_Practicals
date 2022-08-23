import scala.io.StdIn._

object Q1 extends App {
    def prime(n: Int, i: Int = 2): Boolean = n match {
        case x if x == i => true
        case x if gcd(n, i) > 1 => false
        case _ => prime(n, i+1)
    }

    def gcd(a: Int, b: Int): Int = b match {
        case 0 => a
        case b if(b > a) => gcd(b, a)
        case _ => gcd(b, a%b)
    }

    print("Enter a Number: ")
    var n = readInt()
    println(prime(n))
}