fun main() {
    print("Enter digit: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]
        val value = ch - '0'
        println("value = $value")
        println(value * 2)
    }
}