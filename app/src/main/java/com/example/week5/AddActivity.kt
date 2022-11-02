package com.example.week5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week5.databinding.ActivityAddBinding

class AddActivity: AppCompatActivity() {

    private lateinit var viewBinding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btnSave.setOnClickListener {
            addTask()
        }

    }

    private fun addTask() {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("key", viewBinding.edtTitle.text.toString())
        }
        setResult(RESULT_OK, intent)
        finish()
    }


}