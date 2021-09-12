import kotlin.math.exp

interface Expression

class Number(val value: Int): Expression
class Sum(val first: Expression, val second: Expression): Expression

fun getResult(expression: Expression) : Int =
    when(expression) {
        is Number -> expression.value
        is Sum -> getResult(expression.first) + getResult(expression.second)
        else -> throw IllegalArgumentException("Invalid expression!")
    }

fun main() {
    println("((1 + 5) + 5) = ${getResult(Sum(Sum(Number(1), Number(5)), Number(5)))}")
}