object Q4a {
    // Calculate normal hour payment
    def normal(hours: Int) = hours * 250;

    // Calculate OT hour payment
    def ot(hours: Int) = hours * 85;

    // Calculate income
    def income(h1: Int, h2: Int) = normal(h1) + ot(h2);

    // Calculate tax amount
    def tax(income: Int) = income * 0.12;

    // Calculate take home salary
    def takeHome(h1: Int, h2: Int) = income(h1, h2) - tax(income(h1, h2));

    def main(args: Array[String]) = {
        println(takeHome(40, 30)); // 11044.0
    }
}