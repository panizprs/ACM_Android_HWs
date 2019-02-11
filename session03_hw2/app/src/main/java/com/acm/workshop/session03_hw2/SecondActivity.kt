package com.acm.workshop.session03_hw2


import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultText = findViewById<TextView>(R.id.colorResult)
//        println("second")
//        println(intent.extras.getInt(MainActivity.MY_COLOR_KEY))
//        resultText.setBackgroundColor(intent.extras.getInt(MainActivity.MY_COLOR_KEY))
        resultText.text = " ${(intent.extras.getString(MainActivity.MY_COLOR_NAME))} \n is selected"
//        resultText.background = ColorDrawable(R.color.colorRed)
        resultText.setBackgroundResource(intent.extras.getInt(MainActivity.MY_COLOR_KEY))
//        resultText.setTextColor(intent.extras.getInt(MainActivity.MY_TEXT_COLOR_KEY))
    }
}
