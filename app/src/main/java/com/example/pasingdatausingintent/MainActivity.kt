package com.example.pasingdatausingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG: String ="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val login = findViewById<Button>(R.id.login)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val male = findViewById<CheckBox>(R.id.male)
        val female = findViewById<CheckBox>(R.id.female)

        login.setOnClickListener {
          val intent = Intent(this@MainActivity,HomeActivity::class.java)

           val name = username.text.toString()
           intent.putExtra("name",name)

            val pass = password.text.toString()
            intent.putExtra("password",pass)


           Log.d(TAG,name.toString())
            Log.d(TAG,pass.toString())

           if(male.isChecked){
               val male1 = male.text.toString()
               intent.putExtra("male",male1)
               Log.d(TAG,male1.toString())
           }

            if(female.isChecked){
                val female1 = female.text.toString()
                intent.putExtra("female",female1)
                Log.d(TAG,female1.toString())
            }

            startActivity(intent)

        }

    }

}