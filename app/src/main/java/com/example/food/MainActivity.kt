package com.example.food

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordEdit: EditText = findViewById(R.id.passwordEdit)
        val visibleButton: ImageButton = findViewById(R.id.buttonVisible)
        val signUpButton: TextView = findViewById(R.id.signupButton)
        val loginButton: Button = findViewById(R.id.loginButton)
        val forgotPassword: TextView = findViewById(R.id.forgotPassword)
        val typeface = Typeface.createFromAsset(assets, "fonts/Sen-Regular.ttf")

        loginButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        signUpButton.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

        visibleButton.setOnClickListener {
            val selection = passwordEdit.selectionEnd
            if ((passwordEdit.inputType == 129) or (passwordEdit.inputType == 128)) {
                passwordEdit.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                passwordEdit.typeface = typeface
                visibleButton.setImageResource(R.drawable.ic_visible_on)
            } else {
                passwordEdit.inputType = 129
                passwordEdit.typeface = typeface
                visibleButton.setImageResource(R.drawable.ic_visible)
            }
            passwordEdit.setSelection(selection)
        }

        forgotPassword.setOnClickListener{
            val intent = Intent(this, ForgotActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}