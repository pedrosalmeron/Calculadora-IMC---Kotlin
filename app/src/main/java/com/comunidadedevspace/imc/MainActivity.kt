package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

          val pesoStr: String = edtpeso.text.toString()
          val alturaStr :String = edtaltura.text.toString()

          if (pesoStr == "" || alturaStr == "" )  {

              Snackbar.make(
                  edtpeso,
                  "Preencha todos os campos",
                  Snackbar.LENGTH_LONG,
              )
                  .show()

          } else {

              val peso : Float = pesoStr.toFloat()
              val altura : Float = alturaStr.toFloat()

              val resultado : Float = peso / (altura * altura)

              println(resultado)


          }




        }


    }
}