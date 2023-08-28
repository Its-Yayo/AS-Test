package com.example.test.viewmodel


import androidx.lifecycle.ViewModel
import com.example.test.model.EqSolution


class EqSolutionVM: ViewModel() {
    // TODO Implement the ViewModel

    private val model = EqSolution()
    private var root1 = 0.0
    private var root2 = 0.0

    fun solve(a: Double, b: Double, c: Double) {
        var roots = model.roots(a, b, c)
        root1 = roots.first!!
        root2 = roots.second!!
    }
}