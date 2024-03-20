package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes inseridos no Edit Text
        // Criar uma variável e associar o componente de UI (Text Input Edit text)


        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)

        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

          val peso = edtpeso.text
          val altura = edtaltura.text



            println("La " + peso)
            println("Éia "+ altura)
        }


    }
}