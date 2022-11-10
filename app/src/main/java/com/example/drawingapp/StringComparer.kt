package com.example.drawingapp

import android.content.Context

class StringComparer {
    fun isEqual(context: Context, stringRes: Int, string: String): Boolean {
        return context.getString(stringRes) == string
    }
}