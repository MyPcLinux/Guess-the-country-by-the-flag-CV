package com.example.guess_the_country_by_the_flag_cv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.guess_the_country_by_the_flag_cv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {

            if (binding.etName.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT)
                        .show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)

                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())

                startActivity(intent)
                finish()
            }
        }
    }
}