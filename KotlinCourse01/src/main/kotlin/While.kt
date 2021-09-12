fun main() {
    var temperature: Int = 0
    var summation: Int = 0
    var counter: Int = 0

    while (temperature != 999) {
        println("Insert a temperature or 999 to exit:")
        temperature = readLine()!!.toInt()

        if (temperature != 999) {
            summation += temperature
            counter++
        }
    }

    println("The median temperature its: ${summation / counter} ºC")
}