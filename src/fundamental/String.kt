package fundamental

fun main() {
//    declare String
    val name = "Kotlin"
    println("Hello, $name!")
//    String literal
    val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimIndent()
    println(text)
//    excapted string
    val price = "Price: \n9.99"
    println(price)

//    string templating
    val price2 = 9.99
    println("Price: $price2")
    println("Price: ${price2 + 1}")
    println("Price: ${'$'}$price2")
    println("Price: \$price2")
//    String formatting
    val price3 = 9.99
    val formattedString  = String.format("Price: %.2f", price3)
    println(formattedString)

    println("Nilai $formattedString adalah $price3")

    val greeting: String = "Hello, Kotlin!"

    val length = greeting.length
    println(length)
}

