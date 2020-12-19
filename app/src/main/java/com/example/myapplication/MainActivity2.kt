package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button3 :Button =findViewById(R.id.button3)
        button3.setOnClickListener{
            finish()
        }
        val button4 :Button =findViewById(R.id.button4)
        button4.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data =Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }
    }
}