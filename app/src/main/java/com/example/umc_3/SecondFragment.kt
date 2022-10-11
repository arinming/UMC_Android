package com.example.umc_3


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc_3.databinding.ActivityMainBinding
import com.example.umc_3.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {
    private lateinit var viewBinding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentSecondBinding.inflate(layoutInflater)
        return viewBinding.root
    }

}