package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val altura: Float= 1.75f * 1.75f
        val peso: Int= 83

        val result= peso / altura

        println(result)


        val btnCalculator: Button = findViewById<Button>(R.id.bntCalculator)
        val edtextPeso : EditText = findViewById<EditText>(R.id.edittextPeso)
        val editAltura : EditText = findViewById<EditText>(R.id.edittextAltura)
        val tvResult: TextView = findViewById(R.id.txtMsg)

        btnCalculator.setOnClickListener {
            val altura: Float= editAltura.text.toString().toFloat()
            val alturaFinal: Float= altura * altura
            val peso: Float= edtextPeso.text.toString().toFloat()

            val result= peso / alturaFinal

            tvResult.text = result.toString()


        }

    }
}