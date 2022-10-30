package com.example.umc_3

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.umc_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        Log.d("Lifecycle", "onCreate")

        val dataList: ArrayList<Data> = arrayListOf()

        dataList.apply {
            add(Data("hello", "1"))
            add(Data("hello", "2"))
            add(Data("hello", "3"))
            add(Data("hello", "4"))
            add(Data("hello", "5"))
            add(Data("hello", "6"))
            add(Data("hello", "7"))
            add(Data("hello", "8"))
            add(Data("hello", "9"))
            add(Data("hello", "10"))
            add(Data("hello", "11"))
            add(Data("hello", "12"))
            add(Data("hello", "13"))
            add(Data("hello", "14"))
            add(Data("hello", "15"))
            add(Data("hello", "16"))
            add(Data("hello", "17"))
            add(Data("hello", "18"))
            add(Data("hello", "19"))
            add(Data("hello", "20"))
            add(Data("hello", "21"))
            add(Data("hello", "22"))
            add(Data("hello", "23"))
            add(Data("hello", "24"))
            add(Data("hello", "25"))
            add(Data("hello", "26"))
            add(Data("hello", "27"))
            add(Data("hello", "28"))
            add(Data("hello", "29"))
            add(Data("hello", "30"))
        }

        val dataRVAdapter = DataRVAdapter(dataList)

        viewBinding.rvData.adapter = dataRVAdapter
        viewBinding.rvData.layoutManager = LinearLayoutManager(this)
    }
    /* Handler(mainLooper).postDelayed({
            dataList.apply {
                add(Data("hello", "16"))
                add(Data("hello", "17"))
                add(Data("hello", "18"))
                add(Data("hello", "19"))
            }
            dataRVAdapter.notifyDataSetChanged()
        }, 1000)
    } */

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestory")
    }
}


