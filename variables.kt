//compiled time consts that never change
const val ERROR_MESSAGE = "Error has occured"

// The value for const val is determined at compile time, where as 
// the value for val is determined during program execution, which means, 
// val can be assigned by a function at run time.
// val can be assigned a value from a function, but const val canno

// use when variable visible is in different parts of the program
internal const val ERROR_MESSAGE = "Error has occured"

// use when variable is used only in specific places or modules
private const val ADD = "+"


// read-only reference - created at run-time but not likely to change 
val heightInCM: Double = 182.0
val userName: String = "Bob"

// arguments to function are val by default
fun doSomething(argument: String) {
    argument = "Haha" // nope, can't be reassigned
}

// var - use when info can change/update
var playerLocationX: Double = 0.0
var playerLocationY: Double = 0.0

fun renderFrame(moveX: Double, moveY: Double) {
    playerLocationX += moveX
    playerLocationY += moveY
}

val school = arrayOf("shark", "salmon", "minnow")
println(java.util.Arrays.toString(school)) // need array utility to print contents instead of the address