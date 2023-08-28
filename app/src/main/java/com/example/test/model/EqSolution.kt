package com.example.test.model

import kotlin.math.pow

class EqSolution {
    // TODO: Implement the Model

    fun roots(a: Double, b: Double, c: Double): Pair<Double?, Double?> {
        var discriminant = b.pow(2.0) - 4 * a * c

        return if (discriminant < 0) {
            Pair(null, null)
        } else {
            var root1 = (-b + discriminant.pow(0.5)) / (2 * a)
            var root2 = (-b - discriminant.pow(0.5)) / (2 * a)
            Pair(root1, root2)
        }

}