package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val Key_Result_IMC = "ResultActivity.KEY_IMC"
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(Key_Result_IMC, 0f)

        val tv_result = findViewById<TextView>(R.id.tv_result)
        val tv_classificação = findViewById<TextView>(R.id.tv_classificação)

        tv_result.text = result.toString()

        val classificação: String = if(result <=16){
            "Magreza Extrema"
        } else if(result > 16 && result <=16.9){
            "Magreza Moderada"
        } else if(result > 17 && result <= 18.5){
            "Magreza Leve"
        } else if(result > 18.6 && result <= 24.9){
            "Peso Ideal"
        } else if(result > 25 && result <= 29.9){
            "Sobrepeso"
        } else if(result > 30 && result <= 34.9){
            "Obesidade Grau 1"
        } else if(result > 35 && result <= 39.9){
            "Obesidade Grau 2"
        } else {
            "Obesidade Grave"
        }
        tv_classificação.text = classificação


    }
}