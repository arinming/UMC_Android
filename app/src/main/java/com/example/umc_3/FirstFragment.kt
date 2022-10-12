package com.example.umc_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.example.umc_3.databinding.FragmentFirstBinding


class FirstFragment: Fragment() {
    private lateinit var viewBinding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding.btnET2.setOnClickListener {
            val result = "result"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }
        viewBinding = FragmentFirstBinding.inflate(layoutInflater)
        return viewBinding.root

    }



}