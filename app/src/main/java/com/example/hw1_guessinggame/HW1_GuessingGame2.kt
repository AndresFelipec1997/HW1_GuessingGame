package com.example.hw1_guessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HW1_GuessingGame2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_w1__guessing_game2)



    }

    fun doClick (v: View) {

        val intent = Intent(this, NumberGuessActivity::class.java)

        startActivity(intent)


    }
}