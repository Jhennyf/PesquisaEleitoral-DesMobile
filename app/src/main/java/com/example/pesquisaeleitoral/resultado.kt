package com.example.pesquisaeleitoral


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultado : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)

        val textViewResultado: TextView = findViewById(R.id.textViewResultado)

        val prefeito = intent.getStringExtra("PREFEITO")
        val vereador = intent.getStringExtra("VEREADOR")
        val partido = intent.getStringExtra("PARTIDO")

        val resultadoText = "Prefeito: $prefeito\nVereador: $vereador\nPartido: $partido"
        textViewResultado.text = resultadoText
    }
}