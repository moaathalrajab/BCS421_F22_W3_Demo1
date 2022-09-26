package edu.farmingdale.bcs421.bcs421_f22_w3_demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var mBtn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mBtn2 = findViewById(R.id.button)
        mBtn2.setOnClickListener{moveToActivity3() }


    }

    fun moveToActivity3(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}


/*





val intent = Intent(Intent.ACTION_SEND)
        intent.data = Uri.parse("mailto:")
        intent.type = "text/plain"
        intent.putExtra(android.content.Intent.EXTRA_EMAIL,
        arrayOf<String>("Moaath.alrajab@farmingdale.edu","alrajam@farmingdale.edu"))
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT,"alrajam@farmingdale.edu")
        intent.putExtra(Intent.EXTRA_TEXT, "message")
        startActivity(intent)
 */