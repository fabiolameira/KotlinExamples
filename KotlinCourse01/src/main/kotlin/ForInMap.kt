import java.util.*

fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (char in 'A'..'Z') {
        val binary = Integer.toBinaryString(char.code)
        binaryRepresentation[char] = binary
    }

    for ((char, binary) in binaryRepresentation) {
        println("$char - $binary")
    }
}