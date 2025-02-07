package com.example.food

import android.graphics.Typeface
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val backButton: ImageButton = findViewById(R.id.backButton)
        val passwordEdit: EditText = findViewById(R.id.passwordEdit)
        val repasswordEdit: EditText = findViewById(R.id.rePasswordEdit)
        val visibleButton: ImageButton = findViewById(R.id.buttonVisible)
        val revisibleButton: ImageButton = findViewById(R.id.reButtonVisible)
        val typeface = Typeface.createFromAsset(assets, "fonts/Sen-Regular.ttf")

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

        revisibleButton.setOnClickListener {
            val selection = repasswordEdit.selectionEnd
            if ((repasswordEdit.inputType == 129) or (repasswordEdit.inputType == 128)) {
                repasswordEdit.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                repasswordEdit.typeface = typeface
                revisibleButton.setImageResource(R.drawable.ic_visible_on)
            } else {
                repasswordEdit.inputType = 129
                repasswordEdit.typeface = typeface
                revisibleButton.setImageResource(R.drawable.ic_visible)
            }
            repasswordEdit.setSelection(selection)
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