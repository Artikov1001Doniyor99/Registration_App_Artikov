package com.example.modul_4_lesson_9_1_1

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modul_4_lesson_9_1_1.databinding.ActivityThirdBinding
import com.google.gson.Gson

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding
    lateinit var list:ArrayList<User>


    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MySharedPreference.init(this)
        list = MySharedPreference.obyekString


        binding.signUpSecond.setOnClickListener {
            if (binding.editThird2.text.toString() == binding.editThird3.text.toString()){
                val username = binding.editThird1.text.toString()
                val password = binding.editThird2.text.toString()

                if(username != "" && password != ""){
                    var user = User(username, password)
                    list.add(user)
                    MySharedPreference.obyekString = list
                    Toast.makeText(this, "Ma'lumotlar saqlandi", Toast.LENGTH_SHORT).show()
                    finish()
                }else{
                    Toast.makeText(this, "To'g'ri kiritilganini tekshiring", Toast.LENGTH_SHORT).show()
                }
            }
            }


        binding.idClickSign.setOnClickListener {
            binding.editThird1.setText("")
            binding.editThird2.setText("")
            binding.editThird3.setText("")
            val intent4 = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent4)
            finish()
        }

    }

    override fun onResume() {
        super.onResume()
        binding.editThird1.setText("")
        binding.editThird2.setText("")
        binding.editThird3.setText("")

    }

}