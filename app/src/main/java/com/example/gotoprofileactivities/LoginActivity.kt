package com.example.myprj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.gotoprofileactivities.R

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_button = findViewById<Button>(R.id.login_button);

        login_button.setOnClickListener {

            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }

        val skip_button = findViewById<Button>(R.id.skip_button_2)

        skip_button.setOnClickListener {

            val intent = Intent(this, LoginAct::class.java)
            startActivity(intent)

        }



    }
}