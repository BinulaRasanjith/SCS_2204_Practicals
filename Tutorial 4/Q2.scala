object Q2 extends App {
    def isEven(n: Int): Boolean = n match {
        case 0 => true;
        case _ => isOdd(n - 1);
    }
    def isOdd(n: Int): Boolean = !isEven(n);

    scala.io.StdIn.readInt() match {
        case x if x <= 0  => println("Negative/Zero");
        case x if isEven(x) => println("Even");
        case x if isOdd(x) => println("Odd");
    }
}