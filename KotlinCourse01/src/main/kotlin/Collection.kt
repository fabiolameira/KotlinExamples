fun main() {
    val fruits = ArrayList<String>()
    fruits.add("Apple")
    fruits.add("Banana")
    fruits.add("Kiwi")
    println(fruits)

    val animals = arrayListOf<String>("Dog", "Cat", "Cow")
    println(animals)

    println(HashSet::class.java)

    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.maxOrNull())
}