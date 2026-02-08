package com.example.lib
/**
 * Base type for all geometric shapes.
 *
 * @property color The display color of the shape.
 * @property isTransparent Whether the shape is rendered with transparency.
 */

sealed class ShapeSenior(
    val color: String,
    val isTransparent: Boolean
) {

    /**
     * Computes the perimeter (circumference) of the shape.
     */
    abstract fun calculatePerimeter(): Double

    /**
     * Computes the area of the shape.
     */
    abstract fun calculateArea(): Double
}
