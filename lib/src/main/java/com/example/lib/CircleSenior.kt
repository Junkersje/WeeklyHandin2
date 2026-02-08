package com.example.lib
import kotlin.math.PI

/**
 * Represents a circle defined by its radius.
 *
 * @property radius Must be > 0.
 */
class CircleSenior(
    private val radius: Double,
    color: String,
    isTransparent: Boolean
) : ShapeSenior(color, isTransparent) {

    init {
        require(radius > 0) { "Radius must be positive. Provided: $radius" }
    }

    override fun calculatePerimeter(): Double =
        2 * PI * radius

    override fun calculateArea(): Double =
        PI * radius * radius
}
