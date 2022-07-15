object Q5 {
    def easyPace(d: Int): Int = 8*d
    def tempoPace(d: Int): Int = 7*d

    def main(args: Array[String]) = {
        println( easyPace(2) + tempoPace(3) + easyPace(2) )
    }
}