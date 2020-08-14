package com.example.hw1_guessinggame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var inte:Int?=0
    val number = Random.nextInt(1000)
    //var n= number.toString()

    fun doClick (v: View) {

        val nro1 = numero.text.toString().toInt()

        val view = this.currentFocus
        view?.let { v ->
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.let { it.hideSoftInputFromWindow(v.windowToken, 0) }
        }

        inte = inte?.plus(1)

        if (nro1 > 1000 ){

            Toast.makeText(getApplicationContext(), "EL NÚMERO TIENE QUE SER ENTRE 1 Y 1000", Toast.LENGTH_LONG).show();

        }else {

            tunumero.text = "tu numero jugado: ${nro1.toString()}"

            //funcionalidad adicional
            if (inte == 10) {

                var image1: View
                image1 = findViewById(R.id.tunumero2)
                aleatorio.visibility = View.VISIBLE

            }
           //funcionalidad app
            if (number == nro1) {
                Toast.makeText(
                    getApplicationContext(),
                    "¡lo conseguiste en $inte intentos!",
                    Toast.LENGTH_LONG
                ).show();

                val intent = Intent(this, HW1_GuessingGame2::class.java)

                startActivity(intent)

            }
            if (number > nro1) {


                Toast.makeText(getApplicationContext(), "¡tu número es menor!", Toast.LENGTH_LONG)
                    .show();
            }
            if (number < nro1) {


                Toast.makeText(getApplicationContext(), "¡tu número es mayor!", Toast.LENGTH_LONG)
                    .show();
            }
        }


    }

    fun doClick1 (v: View) {
        Toast.makeText(getApplicationContext(), " Te dare una ayuda", Toast.LENGTH_SHORT).show();
        var image1: View
        image1 = findViewById(R.id.tunumero2)
        tunumero2.visibility =View.VISIBLE

        tunumero2.text = "Digita este número para ganar: ${number.toString()}"

    }

    fun doClick2 (v: View) {

        var image1: View
        var image2: View
        image1 = findViewById(R.id.REGLAS)
        if (REGLAS.visibility ==View.INVISIBLE && button.visibility==View.VISIBLE) {
            REGLAS.visibility = View.VISIBLE
            button.visibility=View.INVISIBLE
        }else{
            REGLAS.visibility = View.INVISIBLE
            button.visibility=View.VISIBLE
        }
       // tunumero2.text = "El número es: ${number.toString()}"


    }
}