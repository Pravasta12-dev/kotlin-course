package fundamental

//exception class

class ExceptionClass(){
    fun exception(){
        try {
            val a = 10 / 0
        } catch (e: ArithmeticException) {
            println("Arithmetic Exception $e")
        } catch (e: Exception) {
            println("Parent Exception")
        }
    }
}

//Checked Exception
class CheckedException(){
    fun checkedException(){
        try {
            val a = 10 / 0
        } catch (e: ArithmeticException) {
            println("Arithmetic Exception $e")
        } catch (e: Exception) {
            println("Parent Exception")
        }
    }
}

//Nothing Type
class NothingType(){
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}

fun main() {
    val exception = ExceptionClass()
    exception.exception()

    val checkedException = CheckedException()
    checkedException.checkedException()

//    val nothingType = NothingType()
//    nothingType.fail("Error")
}