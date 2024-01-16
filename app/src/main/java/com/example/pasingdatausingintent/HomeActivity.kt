package com.example.pasingdatausingintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity:AppCompatActivity() {

      val TAG : String = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name1 = findViewById<TextView>(R.id.nameh)
        val pass1 = findViewById<TextView>(R.id.passh)
        val male2 = findViewById<TextView>(R.id.maleh)
        val female2 = findViewById<TextView>(R.id.femaleh)

        val name = intent.getStringExtra("name")
         name1.text =name

        val pass = intent.getStringExtra("password")
         pass1.text = pass

        if(intent.hasExtra("male")){
           val male =intent.getStringExtra("male")
            male2.text = male
        }
        if(intent.hasExtra("female")){
            val female =intent.getStringExtra("female")
            female2.text = female
        }


    }
}