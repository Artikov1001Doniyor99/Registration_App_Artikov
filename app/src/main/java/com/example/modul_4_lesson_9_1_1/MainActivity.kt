package com.example.modul_4_lesson_9_1_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul_4_lesson_9_1_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.logIn.setOnClickListener {
           val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.regisIn.setOnClickListener {
            val intent2 = Intent(applicationContext, ThirdActivity::class.java)
            startActivity(intent2)
        }

        binding.artikovD.setOnClickListener {
            Toast.makeText(this, "Dasturchi:Artikov Doniyor Xo'jamurodovich", Toast.LENGTH_SHORT).show()
        }

    }
}