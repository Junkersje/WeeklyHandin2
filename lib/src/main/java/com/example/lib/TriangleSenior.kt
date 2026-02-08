package com.example.lib
import kotlin.math.sqrt

/**
 * Represents a triangle defined by three side lengths.
 *
 * @property sideA First side length.
 * @property sideB Second side length.
 * @property sideC Third side length.
 *
 * All sides must be > 0 and satisfy the triangle inequality.
 */
class TriangleSenior(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    color: String,
    isTransparent: Boolean
) : ShapeSenior(color, isTransparent) {

    init {
        require(sideA > 0 && sideB > 0 && sideC > 0) {
            "All sides must be positive."
        }

        require(sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {
            "Triangle inequality violated. Provided sides: $sideA, $sideB, $sideC"
        }
    }

    override fun calculatePerimeter(): Double =
        sideA + sideB + sideC

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}