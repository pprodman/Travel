package com.example.travel

import org.junit.Test

import org.junit.Assert.*


class ImagenTest {
    @Test
    fun `should create a travel with correct values`() {
        val travel = Imagen(R.drawable.image1)
        assertEquals(R.drawable.image1, travel.foto)
    }
}