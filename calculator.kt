/**
 * Program:
 * Simple Calculator
 *
 * Problem Statement:
 * This program accepts one of the following arguments:
 * - "+"
 * - "-"
 * - "*"
 * - "/"
 *
 * If the first argument of the program matches one of the above Strings [1a], execute the appropriate
 * mathematical function [2a]. Display this result in the console [3a].
 *
 * If the first argument of the program does not match any of the above Strings [1b], display an error
 * message in the console [2b].
 *
 */

/**
 * Constants
 * use val
 */

// string creation
val ADD: String = "+"
val SUBTRACT: String = "-"
val MULTIPLY: String = "*"
val DIVIDE: String = "/"

val ERROR_MESSAGE = "Error has occured"


val testOperand1 = 5.0
val testOperand2 = 4.0

// entry point of program
fun main(args: Array<String>) {

    // args is an Array or collection  of data (in this case, strings)
    val operatorSymbol = args[0] 

    start(operatorSymbol)
}

fun start(operatorSymbol: String ){
    if (checkArguments(operatorSymbol)) {
       displayResult(
        evaluateBinomial(testOperand1, testOperand2, operatorSymbol)
       )
    } else {
        displayResult(ERROR_MESSAGE)
    }
}

// does the computation
fun evaluateBinomial(opOne: Double, opTwo: Double, sym: String): String {
    // 'fancy' conditional
    when (sym) {
            ADD -> return (opOne + opTwo).toString()
            SUBTRACT -> return (opOne - opTwo).toString()
            MULTIPLY -> return (opOne * opTwo).toString()
            DIVIDE -> return (opOne / opTwo).toString()
            else -> return ERROR_MESSAGE
        }
}

// one-liner example
fun displayResult(result: String) = System.out.println(result)

// : => return
fun checkArguments(operatorSymbol: String): Boolean {
    when (operatorSymbol) { 
        ADD -> return true
        SUBTRACT -> return true
        MULTIPLY -> return true
        DIVIDE -> return true
        else -> return false
    }
}