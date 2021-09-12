fun main() {
    var temperature: Int
    var summation: Int = 0
    var counter: Int = 0

    do {
        println("Insert a temperature or 999 to exit:")
        temperature = readLine()!!.toInt()

        if (temperature != 999) {
            summation += temperature
            counter++
        }
    } while (temperature != 999)

    println("The median temperature its: ${summation / counter} ºC")
}