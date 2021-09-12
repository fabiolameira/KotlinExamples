fun translateToPortuguese(color: Color): String {
    return when(color) {
         Color.RED -> "VERMELHO"
         Color.BLUE -> "AZUL"
         Color.BLACK -> "PRETO"
         Color.GREEN -> "VERDE"
         Color.ORANGE -> "LARANJA"
         Color.YELLOW -> "AMARELO"
    }
}

fun getTemperature(color: Color): String {
    return when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "HEAT"
        Color.BLUE, Color.GREEN -> "COLD"
        Color.BLACK -> "NEUTRAL"
    }
}

fun main() {
    println(translateToPortuguese(Color.YELLOW))
    println(getTemperature(Color.BLUE))
}