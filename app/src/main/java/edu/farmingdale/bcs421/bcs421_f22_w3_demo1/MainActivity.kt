package edu.farmingdale.bcs421.bcs421_f22_w3_demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mBtn1: Button
    lateinit var mTv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtn1 = findViewById(R.id.btn1)
        mTv = findViewById(R.id.tv1)

        mBtn1.setOnClickListener{doSomething() }
    }

    fun doSomething(){
        mTv.setText("Moaath Alrajab 99999")
    }
}