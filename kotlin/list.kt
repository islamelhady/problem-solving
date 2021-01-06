// Created by islam elhady on 06/01/2021.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    // Access elements of the list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // Use the contains() method
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
}

// the output

/**
* List: [1, 2, 3, 4, 5, 6]
* Size: 6
* First element: 1
* Second element: 2
* Last index: 5
* Last element: 6
* First: 1
* Last: 6
* Contains 4? true
* Contains 7? false
*/