fun main() {
    println(max(2, 1))
    println(min(2, 1))
}

// max - block function
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// min - expression function
fun min(a: Int, b: Int): Int = if (a <  b) a else b