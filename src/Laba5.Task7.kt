fun main() {
    print("Enter char: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]
        println(ch.isDigit())
        println(ch.isLetter())
        println(ch.isWhitespace())
        println(ch.lowercaseChar())
        println(ch.uppercaseChar())
    }
}