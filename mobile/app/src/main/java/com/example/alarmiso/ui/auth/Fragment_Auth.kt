package com.example.alarmiso.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.alarmiso.databinding.FragmentAuthBinding
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.alarmiso.R

class Fragment_Auth: Fragment() {

    private var _binding: FragmentAuthBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentAuthBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.alarmsFragment)
        }
    }

}