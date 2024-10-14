package com.example.pesquisaeleitoral

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class  voto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.voto)

        val btnVotar: Button = findViewById(R.id.btnVotar)
        val radioGroupPrefeito: RadioGroup = findViewById(R.id.radioGroupPrefeito)
        val editTextVereador: EditText = findViewById(R.id.editTextVereador)
        val radioGroupPartido: RadioGroup = findViewById(R.id.radioGroupPartido)

        btnVotar.setOnClickListener {
            val selectedPrefeitoId = radioGroupPrefeito.checkedRadioButtonId
            val selectedPrefeito = if (selectedPrefeitoId != -1) {
                findViewById<RadioButton>(selectedPrefeitoId).text.toString()
            } else {
                "Nenhum prefeito selecionado"
            }

            val vereador = editTextVereador.text.toString()

            val selectedPartidoId = radioGroupPartido.checkedRadioButtonId
            val selectedPartido = if (selectedPartidoId != -1) {
                findViewById<RadioButton>(selectedPartidoId).text.toString()
            } else {
                "Nenhum partido selecionado"
            }

            val intent = Intent(this, resultado::class.java).apply {
                putExtra("PREFEITO", selectedPrefeito)
                putExtra("VEREADOR", vereador)
                putExtra("PARTIDO", selectedPartido)
            }
            startActivity(intent)
        }
    }
}