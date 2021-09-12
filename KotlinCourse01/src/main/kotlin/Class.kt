// Immutable class
class Person(
    val name: String,
    val age: Int
)

class Rectangle(private val height: Int, private val width: Int) {

    // Custom advisor
    val isSquare
        get() = height == width

    // Simple function
    fun isRectangle(): Boolean {
        return height != width
    }
}

fun main() {
    val person: Person = Person("Josh", 25)
    println("Person name: ${person.name}")
    println("Person age: ${person.age}")

    val rectangle: Rectangle = Rectangle(5, 5)
    println("Is square? ${rectangle.isSquare}")
    println("Is rectangle? ${rectangle.isRectangle()}")

}