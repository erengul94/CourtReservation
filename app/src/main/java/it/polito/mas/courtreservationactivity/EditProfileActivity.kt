package it.polito.mas.courtreservationactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        val cancelButton : Button = findViewById(R.id.edit_cancel_button)
        val saveButton : Button = findViewById(R.id.edit_save_button)


        saveButton.setOnClickListener {

            Toast.makeText(applicationContext, "Changes saved", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}