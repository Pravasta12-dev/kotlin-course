package fundamental

val num = 15
val result = if (num > 10) "Greater" else "Smaller"



fun main() {
    println(result)

    val x = 5
    val y = 10
    val result = when {
        x > y -> "x is greater"
        x < y -> "y is greater"
        else -> "x and y are equal"
    }

    println(result)

    val a = 5
    val b = 10
    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)
}
