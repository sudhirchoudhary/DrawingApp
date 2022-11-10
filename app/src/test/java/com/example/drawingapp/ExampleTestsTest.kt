package com.example.drawingapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ExampleTestsTest {

    //tests for fibonacci numbers
    @Test
    fun `negative index returns -1`() {
        val result = ExampleTests.nthFibonacciNumber(-1)
        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun `index 0 returns 0`() {
        val result = ExampleTests.nthFibonacciNumber(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `index 1 returns 1`() {
        val result = ExampleTests.nthFibonacciNumber(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `index 2 return 1`() {
        val result = ExampleTests.nthFibonacciNumber(1)
        assertThat(result).isEqualTo(1)
    }

    //tests for braces validation
    @Test
    fun `empty string return true`() {
        val result = ExampleTests.validateBraces("")
        assertThat(result).isTrue()
    }

    @Test
    fun `unequal number of braces return false` () {
        val result = ExampleTests.validateBraces("(")
        assertThat(result).isFalse()
    }

    @Test
    fun `equal number of braces return true` () {
        val result = ExampleTests.validateBraces("()(()))(")
        assertThat(result).isTrue()
    }

}