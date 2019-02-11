package com.acm.workshop.session03_hw2

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    companion object {
        const val MY_COLOR_KEY = "COLOR"
        const val MY_TEXT_COLOR_KEY = "TEXT_COLOR"
        const val MY_COLOR_NAME = "COLOR_NAME"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton =findViewById<Button>(R.id.red)
        val greenButton =findViewById<Button>(R.id.green)
        val orangeButton =findViewById<Button>(R.id.orange)
        val purpleButton =findViewById<Button>(R.id.purple)
        val yellowButton =findViewById<Button>(R.id.yellow)
        val blueButton =findViewById<Button>(R.id.blue)

        val intent = Intent(this, SecondActivity::class.java)
        redButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, redButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorRed.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorWhite.absoluteValue)
            startActivity(intent)
        }
        greenButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, greenButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorGreen.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorWhite.absoluteValue)
            startActivity(intent)
        }
        orangeButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, orangeButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorOrange.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorWhite.absoluteValue)
            startActivity(intent)
        }
        purpleButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, purpleButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorPurple.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorWhite.absoluteValue)
            startActivity(intent)
        }
        yellowButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, yellowButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorYellow.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorBlack.absoluteValue)
            startActivity(intent)
        }
        blueButton.setOnClickListener {
            intent.putExtra(MY_COLOR_NAME, blueButton.text)
            intent.putExtra(MY_COLOR_KEY, R.color.colorBlue.absoluteValue)
            intent.putExtra(MY_TEXT_COLOR_KEY, R.color.colorWhite.absoluteValue)
            startActivity(intent)
        }
    }
}
