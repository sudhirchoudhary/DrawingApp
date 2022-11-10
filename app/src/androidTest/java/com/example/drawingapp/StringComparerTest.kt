package com.example.drawingapp

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class StringComparerTest {
    private lateinit var resourceComparer: StringComparer

    @Before
    fun setUp() {
        resourceComparer = StringComparer()
    }

    @After
    fun tearDown() {
        //to remove the objects after the testing is done.
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer?.isEqual(context, R.string.app_name, "DrawingApp")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentThanGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer?.isEqual(context, R.string.app_name, "Sudhir")
        assertThat(result).isFalse()
    }
}