 package com.example.barbeariaavelino.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barbeariaavelino.R

class Agendamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendamento)

        supportActionBar?.hide()
    }
}