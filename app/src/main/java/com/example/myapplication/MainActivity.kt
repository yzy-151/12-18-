package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//加载一个布局，布局的id在R里面
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this,"进不入以离游兮，退将复修吾初服",Toast.LENGTH_SHORT).show()
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
            val button2 :Button = findViewById(R.id.button2)
            button2.setOnClickListener {
                val intent =Intent("come.example.myapplication.ACTION_START")
                startActivity(intent)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item->Toast.makeText(this,"俅国杨好评",Toast.LENGTH_SHORT).show()
            R.id.add_item2->Toast.makeText(this,"宋浩yyds",Toast.LENGTH_SHORT).show()
            R.id.add_item4->Toast.makeText(this,"bilibili大学在读",Toast.LENGTH_SHORT).show()
            R.id.add_item5->Toast.makeText(this,"无相之风",Toast.LENGTH_SHORT).show()
            R.id.add_item6->Toast.makeText(this,"落雷",Toast.LENGTH_SHORT).show()
            R.id.add_item7->Toast.makeText(this,"点到为止",Toast.LENGTH_SHORT).show()
            R.id.add_item8->Toast.makeText(this,"诺克萨斯，即将崛起",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}