package fundamental

fun main() {
    println(greet("Kotlin"))
    printMessage("Hello, Kotlin!")
    println(add(10, 5))
    println(sum(1, 2, 3, 4, 20))
}

fun greet(name: String): String {
    return "Hello, $name!"
}

fun printMessage(message: String): Unit {
    println(message)
}

//other method Unit
fun printMessage2(message: String) {
    println(message)
}

//single Expression
fun add(a: Int, b: Int): Int = a + b

//Varargs
fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}