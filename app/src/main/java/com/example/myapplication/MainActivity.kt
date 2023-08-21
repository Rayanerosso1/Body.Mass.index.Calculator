package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val altura: Float = 1.75f * 1.75f
        val peso: Int = 83

        val result = peso / altura

        println(result)


        val btnCalculator: Button = findViewById<Button>(R.id.bntCalculator)
        val edtextPeso: EditText = findViewById<EditText>(R.id.edittextPeso)
        val editAltura: EditText = findViewById<EditText>(R.id.edittextAltura)
        val editname = findViewById<EditText>(R.id.edittextname)

        btnCalculator.setOnClickListener {


                val altura: Float = editAltura.text.toString().toFloat()
                val alturaFinal: Float = altura * altura
                val peso: Float = edtextPeso.text.toString().toFloat()
                val name: String = editname.text.toString()
                val result = peso / alturaFinal


                val intent = Intent(this, ResultActivity::class.java)
                    //aqui passamos de uma tela pra outra na Intent.

                    .apply {

                        putExtra("EXTRA_RESULT", result)
                        putExtra("EXTRA_NAME", name)

                    }
                startActivity(intent)

            }
        }

    }
