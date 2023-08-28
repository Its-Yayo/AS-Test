package com.example.test.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.test.R
import com.example.test.databinding.ActivityMainBinding
import com.example.test.viewmodel.EqSolutionVM

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val eqSolutionVM: EqSolutionVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        events()
        viewers()
    }

    private fun viewers() {
        // FIXME 1. Subscribe to the changes of root1 and root2
        eqSolutionVM.root1.observe(this) { value ->
            binding.etRoot1.setText("%.2f".format(value))
        }

        eqSolutionVM.root2.observe(this) { value ->
            binding.etRoot2.setText("%.2f".format(value))
        }
    }

    private fun events() {
        binding.btnSolve.setOnClickListener {
            val a = binding.etA.text.toString().toDouble()
            val b = binding.etB.text.toString().toDouble()
            val c = binding.etC.text.toString().toDouble()

            // FIXME 2. Call the solve method of the ViewModel
            eqSolutionVM.solve(a, b, c)
        }
    }
}

