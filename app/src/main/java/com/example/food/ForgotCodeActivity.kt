package com.example.food

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_code)

        val backButton: ImageButton = findViewById(R.id.backButton)
        val userEmail: TextView = findViewById(R.id.userEmail)

        userEmail.text = intent.getStringExtra("USER_EMAIL")

        backButton.setOnClickListener{
            finish()
        }
    }



    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}