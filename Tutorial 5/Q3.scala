import scala.io.StdIn._

object Q3 extends App {
    def sum(n: Int): Int = {
        if (n == 0) 0
        else n+sum(n-1)
    }

    print("Enter a Number: ")
    var n = readInt()
    println(sum(n))
}