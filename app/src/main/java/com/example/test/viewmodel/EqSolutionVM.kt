package com.example.test.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.model.EqSolution


class EqSolutionVM: ViewModel() {
    // TODO Implement the ViewModel

    private val model = EqSolution()

    val root1 = MutableLiveData<Double>()
    val root2 = MutableLiveData<Double>()

    fun solve(a: Double, b: Double, c: Double) {
        var roots = model.roots(a, b, c)
        root1 = roots.first!!
        root2 = roots.second!!
    }
}