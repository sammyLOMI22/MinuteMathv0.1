package com.gothicvanitympc.minutemath
import kotlin.math.absoluteValue
import kotlin.text.*
import kotlin.time.*
fun minMath(srtTime: String, nbHours: Int, nbMins: Int): String {
//todo fix formula to convert vaule to time and add in minutes
    //var startTimeNB = srtTime.text.toString()
    //var finishTimeNB = fnTime.text.toString()

    //turn in to time by spliting numbers
    var sHour = srtTime.split(":")
    var startH = sHour[0]
    var startM =sHour[1]

    // figure out hours
    var hrinMins= nbHours * 60

    // Figure out total amount of time by adding up hours and minutes to start time
    var totalNewTelapses = hrinMins + nbMins

    //convert starttime to minutes
    //value for number of minutes in hour
    val mnh= 60
    //value for minutes in day
    val mnd = 1440
    var sMinT=(startH.toInt() * mnh) + startM.toInt()

    //add total minutes together
    var totalTime = totalNewTelapses+ sMinT

    var newHour = totalTime/mnh
    var newMin = totalTime-(newHour *60)
    //convert new minutes to string for time format
    var newMinS = ""
    newMinS = newMin.toString()
    when(newMin){
        0-> newMinS = "00"
        1-> newMinS = "01"
        2-> newMinS = "02"
        3-> newMinS = "03"
        4-> newMinS = "04"
        5-> newMinS = "05"
        6-> newMinS = "06"
        7-> newMinS = "07"
        8-> newMinS = "08"
        9-> newMinS = "09"
    }

//todo add method call for switch to conveter time to 12 hour time
// what if the user enter more than 24 hours

    return "Endtime: "+ newHour.absoluteValue.toString().format(2) + ":"+ newMinS

}