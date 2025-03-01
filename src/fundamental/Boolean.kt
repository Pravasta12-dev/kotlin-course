package fundamental

fun main() {
//    boolean declaration
    val isKotlinFun: Boolean = true
    val isJavaFun = false

    println(isKotlinFun)
    println(isJavaFun)

//    boolean manipulation
    println(isKotlinFun && isJavaFun)
    println(isKotlinFun || isJavaFun)

//    Char
    val charA = 'A'
    val charB = 'B'
    println(charA < charB)
    println(charA + 1)
    println(charB + 1)

//    Char function and property
    println(charA.lowercaseChar())
    println(charA.uppercaseChar())
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.isLetter())
    println(charA.isWhitespace())
    println(charA.isUpperCase())
    println(charA.isLowerCase())

}