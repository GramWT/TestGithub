package com.example.test

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<TextView>(R.id.button)


        val a = intent.getIntExtra("key",10)

        button.text = a.toString()

        button.setOnClickListener {
            val context:Context = this
            val intent = Intent(context,SecondActivity::class.java)
            val num = 10
            intent.putExtra("key",num)
            startActivity(intent)

        }

        println(1)
    }

    override fun onStart() {
        super.onStart()

        println(2)
    }

    override fun onResume() {
        super.onResume()
        println(3)

    }

    override fun onPause() {
        super.onPause()
        println(4)

    }

    override fun onStop() {
        super.onStop()
        println(5)
    }

    override fun onRestart() {
        super.onRestart()
        println(7)
    }

    override fun onDestroy() {
        super.onDestroy()
        println(6)
    }

}