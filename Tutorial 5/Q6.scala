import scala.io.StdIn._

object Q5 extends App {
    def fibonacci(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)
    }

    def fibonacciSeq(n: Int, i: Int = 0): Any = {
        if (n <= i) return
        println(fibonacci(i))
        fibonacciSeq(n, i+1)
    }

    print("Enter a Number: ")
    var n = readInt() 
    fibonacciSeq(n)
}