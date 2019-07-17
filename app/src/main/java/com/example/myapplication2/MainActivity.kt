package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var marcadorA: Int = 0
    var marcadorB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun marcar1A(v: View){

        marcadorA++
        etA.setText(marcadorA.toString())
    }
    fun marcar1B(v: View){

        marcadorB++
        etB.setText(marcadorB.toString())
    }
    fun marcar2A(v: View){

        marcadorA+=2
        etA.setText(marcadorA.toString())
    }
    fun marcar2B(v: View){

        marcadorB+=2
        etB.setText(marcadorB.toString())
    }
    fun marcar3A(v: View){

        marcadorA+=3
        etA.setText(marcadorA.toString())
    }
    fun marcar3B(v: View){

        marcadorB+=3
        etB.setText(marcadorB.toString())
    }
    fun reset(v: View){
        etA.setText("0")
        etB.setText("0")
        marcadorA = 0
        marcadorB = 0
    }
}
