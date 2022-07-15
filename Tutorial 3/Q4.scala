object Q4 {
    def discount(p: Double): Double = p*60/100
    def wholeSaleCost(n: Int, p: Double): Double = {
        if (n <= 50) ( discount(p)+3 )*n
        else ( (discount(p)+3) * 50 ) + ( (discount(p)+0.75)*(n-50) )
    }

    def main(args: Array[String]) = {
        println(wholeSaleCost(60, 24.95))
    }
}