package com.example.drawingapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "sameer",
            "",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different confirmPassword return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sameer",
            "1234",
            "1"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `weak password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sameer",
            "1",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `existing username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sudhir",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username, password and confirmPassword return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sameer",
            "1234",
            "1234"
        )
        assertThat(result).isTrue()
    }
}