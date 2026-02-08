package com.example.lib

class CircleJunior(
    private val radius: Double,
    color: String,
    isTransparent: Boolean
) : ShapeJunior(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
