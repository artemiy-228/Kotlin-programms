import java.util.*

fun main() {
    var digit : Int = readln().toInt();
    var tempDigit : Int = 0;
    var operator : String = "";

    while(true){
        operator = readln().toString();
        tempDigit = readln().toInt();
        when(operator){
            "+" -> digit += tempDigit;
            "-" -> digit -= tempDigit;
            "*" -> digit *= tempDigit;
            "/" -> digit /= tempDigit;

        }
        println(digit);
    }
}