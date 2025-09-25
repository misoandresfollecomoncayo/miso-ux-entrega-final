package com.example.alarmiso.ui.alarms

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.alarmiso.databinding.FragmentAlarmsEditBinding
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.alarmiso.R
import com.example.alarmiso.databinding.FragmentDevicesEditBinding

class Fragment_Devices_Edit: Fragment() {

    private var _binding: FragmentDevicesEditBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentDevicesEditBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener {
            findNavController().navigate(R.id.devicesFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.devicesFragment)
        }
    }

}