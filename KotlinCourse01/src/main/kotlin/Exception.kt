import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun percentage(number: Int): String {
    return if (number in 0..100) {
        "$number%"
    } else {
        throw IllegalArgumentException("The number $number is not between 0 and 100!")
    }
}

fun readAge(): Int? {
    val reader = FileReader(File("src/main/resources/Ages.txt"))
    val buffer = BufferedReader(reader)

    try {
        val number = buffer.readLine()
        return Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }
}

fun main() {
    println(percentage(10))
    println(readAge())
}