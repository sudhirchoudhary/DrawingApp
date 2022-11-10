package com.example.drawingapp

object ExampleTests {

    fun nthFibonacciNumber(index: Int): Int {
        if(index < 0) return -1
        if(index == 0) return 0
        if(index == 1) return 1

        return nthFibonacciNumber(index - 1) + nthFibonacciNumber(index - 2)
    }

    fun validateBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }
}