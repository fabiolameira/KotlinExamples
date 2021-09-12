fun percentage(number: Int): String {
    return if (number in 0..100) {
        "$number%"
    } else {
        throw IllegalArgumentException("The number $number is not between 0 and 100!")
    }
}

fun main() {
    println(percentage(10))
}