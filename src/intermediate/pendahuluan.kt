package intermediate

fun main() {
    val cat = Cat("Kitty")
    cat.sound()
    val shapes = arrayOf(Circle(), Rectangle())
    for (shape in shapes) {
        shape.draw()
    }

    val car = Car(100)
    println(car.getSpeed())
    car.setSpeed(200)
    println(car.getSpeed())

    val bike = Bike("Honda")
    bike.drive()

    Database.connect()
    println(MathUtil.square(5))
}

// Abstraction
abstract class Vehicle(val name: String) {
    abstract fun drive()
}

class Bike(name: String) : Vehicle(name) {
    override fun drive() {
        println("$name bike")
    }
}

// companion object
class MathUtil {
    companion object {
        fun square(number: Int) = number * number
    }
}

// Singleton
object Database {
    val name = "MainDb";
    fun connect() {
        println("Connected to $name")
    }
}

// Encapsulation
class Car(private var speed: Int){
    fun getSpeed(): Int {
        return speed
    }

    fun setSpeed(newSpeed: Int) {
        if (newSpeed >=0){
            speed = newSpeed
        } else {
            println("Speed can't be negative")
        }
    }
}

//inheritance
open class Animal (val name: String) {
    open fun sound() {
        println("Animal sound")
    }
}

class Cat(name: String) : Animal(name){
    override fun sound() {
        println("Meow")
    }
}

//polymorphism
open class Shape {
    open fun draw() {
        println("Drawing shape")
    }
}

class Circle : Shape(){
    override fun draw() {
        println("Drawing circle")
    }
}

class Rectangle : Shape(){
    override fun draw() {
        println("Drawing rectangle")
    }
}