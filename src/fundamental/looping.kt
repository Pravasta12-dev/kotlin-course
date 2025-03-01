package fundamental

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

//    iteraksi range
    for (i in 1..5) {
        println(i)
    }

//    iteraksi range with step
    for (i in 1..5 step 2) {
        println(i)
    }

//    iteraksi range with downTo
    for (i in 5 downTo 1) {
        println(i)
    }

    var counter = 5
    while (counter > 0) {
        println("Counting down: $counter")
        counter--
    }
// do setidaknya dijalankan sekali
    var counter2 = 5
    do {
        println("Counting down: $counter2")
        counter2--
    } while (counter2 > 0)

    var i = 0
    do {
        i++
    } while (i < 3)
    println(i)

    for (i in 1 until 5) {
        println(i)
    }
}