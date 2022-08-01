object Q3 extends App {
    def toUpper(str: String) = str.toUpperCase;
    def toLower(str: String) = str.toLowerCase;
    def format1(str: String) = toUpper(str.substring(0,2)) + toLower(str.substring(2,str.length));
    def format2(str: String) = toUpper(str.substring(0,1)) + toLower(str.substring(1,str.length-1)) + toUpper(str.substring(str.length-1, str.length));
    def formatNames(str: String, function: String => String) = function(str);


    println(formatNames("Benny", toUpper));
    println(formatNames("Niroshan", format1));
    println(formatNames("Saman", toLower));
    println(formatNames("Kumara", format2));
}