package com.example.food

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val backButton: ImageButton = findViewById(R.id.backButton)
        val sendButton: Button = findViewById(R.id.sendCode)
        val userEmail: EditText = findViewById(R.id.emailEdit)

        sendButton.setOnClickListener{
            val intent = Intent(this, ForgotCodeActivity::class.java)
            intent.putExtra("USER_EMAIL", userEmail.text.toString())
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        backButton.setOnClickListener{
            finish()
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}