// If number is divisible by 15 - FizzBuzz
// If number is divisible by 5  - Buzz
// If number is divisible by 3  - Fizz
// Else - Print number

fun fizzBuzz(number: Int) = when {
    number % 15 == 0 -> "FizzBuzz "
    number % 5 == 0 -> "Buzz "
    number % 3 == 0 -> "Fizz "
    else -> "$number"
}

fun main() {
    for (number in 1..100) {
        println(fizzBuzz(number))
    }
}