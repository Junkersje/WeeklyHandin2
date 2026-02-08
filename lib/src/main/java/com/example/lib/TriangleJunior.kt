package com.example.lib

class TriangleJunior(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    color: String,
    isTransparent: Boolean
) : ShapeJunior(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        // Heron's formula
        val s = calculatePerimeter() / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}
