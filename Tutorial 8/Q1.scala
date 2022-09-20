case class Point(var x: Int, var y: Int) {
    // Q1. -> a.
    def +(that: Point): Point = Point(this.x + that.x , this.y + that.y);

    // Q1. -> b.
    def move(dx: Int, dy: Int) = {
        x = x + dx;
        y = y + dy;
    }

    // Q1. -> c.
    def distance(that: Point): Double = {
        Math.sqrt(Math.pow(this.x-that.x, 2) + Math.pow(this.y-that.y, 2));
    }

    // Q1. -> d.
    def invert() = {
        var aux = this.x;
        this.x = this.y;
        this.y = aux;
    }

    override def toString(): String = "(" + x + "," + y + ")"
}

object Q1 extends App {
    val p1 = Point(1, 2);
    val p2 = Point(3, 4);

    var p3 = p1 + p2;
    println("\np3: " + p3);

    p3.move(2, -2);
    println("Moved p3: " + p3);

    val d = p1.distance(p2);
    println("Distance between p1 and p2: " + d);

    p3.invert();
    println("Inverted p3: " + p3 + "\n");
}