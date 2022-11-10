package com.example.drawingapp

import android.text.BoringLayout

object RegistrationUtil {
    private val existingUsers = listOf("Sudhir", "mohan")
    /**
     * validation fails if
     *
     * ---> username/password is empty.
     *
     * ---> confirmed password is not same as password.
     *
     * ---> username already exists.
     *
     * ---> password must contain at least 2 characters.
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(userName.isEmpty() || password.isEmpty()) return false
        if(userName in existingUsers) return false
        if(password.length < 2) return false
        if(password != confirmedPassword) return false

        return true
    }
}