enum class Color(private val red: Int, private val green: Int, private val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    ORANGE(255, 165, 0),
    BLACK(255, 255, 255);

    fun toDecimal() = ((red * 256 + green) * 256 + blue)
}

fun main() {
    println(Color.RED.toDecimal())
}