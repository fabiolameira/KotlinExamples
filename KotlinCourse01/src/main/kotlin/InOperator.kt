fun isLetter(char: Char) = char in 'A'..'Z' || char in 'a'..'z'
fun isNotDigit(char: Char) = char !in '0'..'9'

fun main() {
    println("Is 'A' a letter? ${isLetter('A')}")
    println("'9' is not a digit? ${isNotDigit('9')}")
}