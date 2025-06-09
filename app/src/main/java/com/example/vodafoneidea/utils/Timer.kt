package com.example.vodafoneidea.utils

import android.os.CountDownTimer

val countdownTimer = object : CountDownTimer(3000 , 1000) {
    override fun onTick(millisUntilFinished: Long) {
        val secondsRemaining = millisUntilFinished / 1000
        println("Seconds remaining: $secondsRemaining")
    }

    override fun onFinish() {
        println("Timer finished!")
    }

}

