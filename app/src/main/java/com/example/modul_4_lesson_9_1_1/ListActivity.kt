 package com.example.modul_4_lesson_9_1_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.get
import com.example.modul_4_lesson_9_1_1.databinding.ActivityListBinding

 class ListActivity : AppCompatActivity() {

    lateinit var binding: ActivityListBinding
    lateinit var listContacts:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

     override fun onStart() {
         super.onStart()
         MySharedPreference.init(this)
         listContacts = MySharedPreference.obyekString!!

         for (contact in listContacts) {
             var textView = TextView(this)
             var params = LinearLayout.LayoutParams(
                 LinearLayout.LayoutParams.WRAP_CONTENT,
                 LinearLayout.LayoutParams.WRAP_CONTENT
             )
             params.setMargins(50, 100, 50, 200)
             textView.layoutParams = params
             textView.textSize = 20F
             textView.setTextColor(Color.RED)
             textView.text = "${contact.username}\n${contact.password}"
             binding.contactListLayout.addView(textView)
         }


     }
}