package com.example.umc_3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.umc_3.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.frameFragment.id, FirstFragment())
            .commitAllowingStateLoss()

        viewBinding.btnFragment1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, FirstFragment())
                .commitAllowingStateLoss()
        }

        viewBinding.btnFragment2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, SecondFragment())
                .commitAllowingStateLoss()
        }

        supportFragmentManager
            .setFragmentResultListener("requestKey", this) { _ , bundle ->
                val result = bundle.getString("bundleKey")
                Toast.makeText(applicationContext, result, Toast.LENGTH_SHORT).show();
            }
    }
}