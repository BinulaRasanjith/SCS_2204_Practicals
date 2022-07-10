object Q4b {
    // Calculate attendees
    def attendees(ticketPrice: Int): Int = 120 + (15 - ticketPrice) / 5 * 20;

    // Calculate the income
    def income(ticketPrice: Int): Int = ticketPrice * attendees(ticketPrice);

    // Calculate the cost
    def cost(ticketPrice: Int): Int = 500 + 3 * attendees(ticketPrice);

    // Calculate total profit
    def profit(ticketPrice: Int): Int = income(ticketPrice) - cost(ticketPrice);

    def main(args: Array[String]) = {
        println(profit(24))
    }
}