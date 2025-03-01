package fundamental

fun main() {
    val numbers = arrayOf(5,2,8,1,3)
    val strings = arrayOf("Kotlin", "Java", "Python", "C++")
//    array primitive
    val intArray  = intArrayOf(1,2,3,4,5)
    val doubleArray = doubleArrayOf(1.1,2.2,3.3,4.4,5.5)
//    constructor
    val squares = Array(5) { it * it }

//    akses array
    println(numbers.size)
    numbers[0] = 10
    strings[1] = "Flutter"
    println(numbers[0])
    println(strings[1])
    println(intArray[2])
    println(doubleArray[3])
    println(squares[4])

//    iterasi array
    for (number in numbers){
        println(number)
    }

//    work with High Order Function
    val sortedNumber = numbers.sortedArray()
    println(sortedNumber.joinToString())

    val evenNumber = numbers.filter { it % 2 == 0 }
    println(evenNumber.joinToString())
}