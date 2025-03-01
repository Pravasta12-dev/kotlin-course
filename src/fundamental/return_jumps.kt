package fundamental

fun main() {
//    break using nested for
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                break@loop
            }
            println("i: $i, j: $j")
        }
    }

    println("=====================================")

//    continue nested for
    for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                continue
            }
            println("i: $i, j: $j")
        }
    }
    println("=====================================")

//    label
    fun findNumber() {
        listOf(1,2,3,4,5).forEach loop@{ iterate ->
            if (iterate == 3) return@loop
            println(iterate)
        }
        println("Done with loop")
    }

    findNumber()

    for (i in 1..5) {
        if (i == 3) break
        println(i)
    }

    println("test=====================================")

    fun test() {
        listOf(1, 2, 3).forEach {
            if (it == 2) return
            println(it)
        }
        println("End")
    }
    test()

    for (i in 1..5) {
        if (i == 3) break
        println(i)
    }
}