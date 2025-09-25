package com.example.alarmiso.ui.alarms

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.alarmiso.databinding.FragmentAlarmsCreateBinding
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.alarmiso.R

class Fragment_Alarms_Create: Fragment() {

    private var _binding: FragmentAlarmsCreateBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentAlarmsCreateBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener {
            findNavController().navigate(R.id.alarmsFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.alarmsFragment)
        }

    }

}