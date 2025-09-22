package com.example.alarmiso.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.alarmiso.databinding.AuthFragmentBinding
import android.view.ViewGroup
import android.view.View

class AuthFragment: Fragment() {

    private var _binding: AuthFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = AuthFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

}