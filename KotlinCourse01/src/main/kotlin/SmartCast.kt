interface Expression

class Number(val value: Int): Expression
class Sum(val first: Expression, val second: Expression): Expression

fun getResult(expression: Expression) : Int {
    if (expression is Number)
        return expression.value

    if (expression is Sum)
        return getResult(expression.first) + getResult(expression.second)

    throw IllegalArgumentException("Invalid Expression")
}

fun main() {
    println("((1 + 5) + 5) = ${getResult(Sum(Sum(Number(1), Number(5)), Number(5)))}")
}