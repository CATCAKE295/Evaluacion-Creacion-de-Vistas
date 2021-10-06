package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prueba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        multiplicar()
    }

    private fun multiplicar () {

        val btn = binding.btnCalc.setOnClickListener(View.OnClickListener {

            val num = binding.etNumero.text.toString().toIntOrNull()
            val tablita = Tabla(num)

            binding.tvResultado.text = tablita.tablasMultiplicar().toString()
            binding.etNumero.setText("")

        })

    }
}