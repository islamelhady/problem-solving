// Created by islam elhady on 03/01/2021.

fun main() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
          print(",")
    }    
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    // Use a repeat() {} statement to repeat a set of instructions several times.
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}