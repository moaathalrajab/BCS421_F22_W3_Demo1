package edu.farmingdale.bcs421.bcs421_f22_w3_demo1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mBtn1: Button
    private lateinit var mTv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtn1 = findViewById(R.id.btn1)
        mTv = findViewById(R.id.tv1)

        mBtn1.setOnClickListener{doSomething() }

        mTv.setOnClickListener{moveToActivity2() }
    }

    private fun doSomething(){
        mTv.text = "Moaath Alrajab 99999"
        Toast.makeText(this, "Clicked me", Toast.LENGTH_LONG).show()
    }

    private fun moveToActivity2(){
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(android.content.Intent.EXTRA_EMAIL,
            arrayOf("Moaath.alrajab@farmingdale.edu","alrajam@farmingdale.edu"))
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"alrajam@farmingdale.edu")
        intent.putExtra(Intent.EXTRA_TEXT, "message")
        startActivity(intent)

    }
}