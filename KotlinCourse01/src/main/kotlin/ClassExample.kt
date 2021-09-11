// Immutable class
class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person1: Person = Person("Josh", 25)
    val person2: Person = Person("Mary", 24)
    println("Person1 name: ${person1.name}")
    println("Person1 age: ${person1.age}")
    println("Person2 name: ${person2.name}")
    println("Person2 age: ${person2.age}")
}