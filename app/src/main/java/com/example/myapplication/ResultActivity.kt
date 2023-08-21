package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val Tvresult = findViewById<TextView>(R.id.textview_result)
        val Tvname = findViewById<TextView>(R.id.Tvname)
        val result2 = intent.getStringExtra("EXTRA_NAME")
        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)
        Tvresult.text = result.toString()

Tvname.text= result2.toString()
       val Tvclassification= findViewById<TextView>(R.id.textview_classificacao)
        var classificacao = ""

        if (result >= 18.5f) {
            when (result) {
                in 18.5f..24.9f -> {

                    classificacao = "PESO NORMAL."

                }
                in 25.0f..29.9f -> {

                    classificacao = "SOBREPESO 1"


                }
                in 30.0f..39.9f -> {

                    classificacao = "OBESIDADE"

                }
                else -> {

                    classificacao = "OBESIDADE GRAVE"

                }
            }
        } else {

            classificacao = "ABAIXO DO PESO."

        }

Tvclassification.text="Classification:$classificacao"

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}