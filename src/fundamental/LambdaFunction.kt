package fundamental

fun main() {
    val sum = operate(10, 5, ::sum)
    println(sum)
    println(add(10, 5))
    println(multiply(10, 5))
}
//    HOF -> High Order Function
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

//Function Types
val add: (Int, Int)-> Int = {
    a, b -> a + b
}

//Anonymous Function
val multiply = fun(a: Int, b: Int): Int = a * b
