import scala.io.StdIn._

object Q5 extends App {
    def isEven(n: Int): Boolean = n match {
        case 0 => true;
        case _ => isOdd(n - 1)
    }

    def isOdd(n: Int): Boolean = !isEven(n)

    def evenSum(n: Int): Int = n match {
        case 0 => 0
        case x if (isEven(x)) => x + evenSum(x-1)
        case x if (isOdd(x)) => evenSum(x-1)
    }

    print("Enter a Number: ")
    var n = readInt() 
    println(evenSum(n))
}