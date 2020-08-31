package com.gothicvanitympc.minutemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.minute_math_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.minute_math_view)
        calcBtn.setOnClickListener { minCalc() }
    }
    private fun minCalc(){

        var startTime =stTime.text.toString()
        var nmHours = nmHours.text.toString()
        var nmMins = nmMinutes.text.toString()
        // validate input
        //turn in to time by spliting numbers
        var sHour = startTime.split(":")
        var startH = sHour[0]
        var startM =sHour[1]
        if (startH.toInt() in 1..24) {
            if (startM.toInt() in 0..59) {
            // call MinMath method
                var res = minMath(startTime, nmHours.toInt(), nmMins.toInt())
                fnlTimeLb.text = res
            }
            else {
                fnlTimeLb.text = "Not a valid hour value! Enter a number between 00-59:XX"
            }
        }
        else {
            fnlTimeLb.text = "Not a valid hour value! Enter a number between 1-12:XX"
        }

    }


}