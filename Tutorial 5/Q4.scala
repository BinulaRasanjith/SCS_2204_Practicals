import scala.io.StdIn._

object Q4 extends App {
    def isEven(n: Int): Boolean = n match {
        case 0 => true;
        case _ => isOdd(n - 1)
    }

    def isOdd(n: Int): Boolean = !isEven(n)

    print("Enter a Number: ")
    var n = readInt() match {
        case x if(isEven(x)) => println("Even")
        case _ => println("Odd")
    }
}