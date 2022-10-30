package com.example.umc_3


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.umc_3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val extras = intent.extras
        val data = extras!!["text"] as String

        viewBinding.tvSecondtext.text = data

        viewBinding.btnNext2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }

        viewBinding.btnNext3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                Toast.makeText(applicationContext, "Back", Toast.LENGTH_SHORT).show();
            }
            setResult(RESULT_OK, intent)
            if (!isFinishing) finish()
        }

        Log.d("Lifecycle2", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle2", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle2", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle2", "onDestory")
    }


}