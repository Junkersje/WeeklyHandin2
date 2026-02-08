package com.example.lib

abstract class ShapeJunior(
    val color: String,
    val isTransparent: Boolean
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}
