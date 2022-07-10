object Q3part2 {
    def main(args: Array[String]) = {
        var (a, b, c, d) = (2, 3, 4, 5);
        var k = 4.3f;

        // a)
        b -= 1;
        println(b * a + c *d);
        d -= 1;

        // b)
        println(a);
        a += 1;

        // c)
        var g = 4.0f; // from the previous question
        println (-2 * ( g - k ) +c);

        // d)
        println (c);
        c += 1;

        // e)
        c += 1;
        println (c * a);
        a += 1;
    }
}