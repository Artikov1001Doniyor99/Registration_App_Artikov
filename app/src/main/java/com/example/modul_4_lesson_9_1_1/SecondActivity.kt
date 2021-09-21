package com.example.modul_4_lesson_9_1_1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.modul_4_lesson_9_1_1.databinding.ActivitySecondBinding
import com.google.gson.Gson

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    lateinit var listSec: ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MySharedPreference.init(this)
        listSec = MySharedPreference.obyekString


        binding.loginSecond.setOnClickListener {
            val username = binding.edit1.text.toString()
            val password = binding.edit2.text.toString()


            for (user in listSec) {
                if (user.username == username && user.password == password){
                    val intentq = Intent(this, WelcomeActivity::class.java)
                    startActivity(intentq)
                    finish()
                    break
                }
            }



        }

        binding.idClickText.setOnClickListener {
            binding.edit1.setText("")
            binding.edit2.setText("")
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)
            finish()
        }

        binding.idClickListP.setOnClickListener {
            binding.edit1.setText("")
            binding.edit2.setText("")
            val intent4 = Intent(this, ListActivity::class.java)
            startActivity(intent4)
            finish()
        }


    }


}