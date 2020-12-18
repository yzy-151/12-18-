package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//加载一个布局，布局的id在R里面
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this,"一刀斩接A接刮走位接一刀斩之",Toast.LENGTH_SHORT).show()
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}