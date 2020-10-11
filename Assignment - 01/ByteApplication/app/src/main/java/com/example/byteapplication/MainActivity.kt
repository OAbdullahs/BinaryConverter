package com.example.byteapplication

import android.app.Activity
import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.pow

class MainActivity : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button00.setOnClickListener(this)
        button01.setOnClickListener(this)
        button02.setOnClickListener(this)
        button03.setOnClickListener(this)
        button04.setOnClickListener(this)
        button05.setOnClickListener(this)
        button06.setOnClickListener(this)
        button07.setOnClickListener(this)

        result.visibility = View.INVISIBLE


    }
    private fun buttonClicked(): Int {
        var dec = 0
        var i = 0
        var rem: Int
        var finalBinaryNum = (
                button00.text.toString() +
                button01.text.toString() +
                button02.text.toString() +
                button03.text.toString() +
                button04.text.toString() +
                button05.text.toString() +
                button06.text.toString() +
                button07.text.toString()).toInt()

        while (finalBinaryNum != 0){
            rem =  finalBinaryNum % 10
            finalBinaryNum /= 10
            dec += rem * (2.0.pow(i.toDouble())).toInt()
            i++
        }
        return dec
    }
    private fun equalMassage() {
        if (outputBinary.text == userInput.text.toString())
            result.visibility = View.VISIBLE
        else
            result.visibility = View.INVISIBLE
    }

    override fun onClick(p0: View?) {
        when(p0){
            button00 -> changeButton(p0 as Button)
            button01 -> changeButton(p0 as Button)
            button02 -> changeButton(p0 as Button)
            button03 -> changeButton(p0 as Button)
            button04 -> changeButton(p0 as Button)
            button05 -> changeButton(p0 as Button)
            button06 -> changeButton(p0 as Button)
            button07 -> changeButton(p0 as Button)
        }
    }
    private fun changeButton(btn: Button){
        if (btn.text == "0") {
                btn.text = "1"
            }
            else {
                btn.text = "0"

            }
            val buttonData = buttonClicked().toString()
            outputBinary.text = buttonData
            equalMassage()
    }
}


