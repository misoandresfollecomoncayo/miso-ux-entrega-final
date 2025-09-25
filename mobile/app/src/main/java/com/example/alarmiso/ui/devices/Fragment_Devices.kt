package com.example.alarmiso.ui.alarms

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alarmiso.R
import com.example.alarmiso.databinding.FragmentDevicesBinding
import com.example.alarmiso.models.Device
import com.example.alarmiso.ui.devices.DeviceAdapter
import com.example.alarmiso.ui.devices.SpaceItemDecoration

class Fragment_Devices: Fragment() {

    private val devices = listOf(
        Device("Bombillo baño", true),
        Device("Bombillo cocina", false),
        Device("Parlante sala", true),
        Device("Cortina habitación", true)
    )

    private var _binding: FragmentDevicesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentDevicesBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.alarmsBtn.setOnClickListener {
            findNavController().navigate(R.id.alarmsFragment)
        }

        val recyclerView = binding.rvDevices
        recyclerView.addItemDecoration(SpaceItemDecoration(20)) // 16px
        recyclerView.layoutManager = LinearLayoutManager(this.context) // lista vertical
        recyclerView.adapter = DeviceAdapter(devices, this)
    }

    public fun editarDispositivo() {
        findNavController().navigate(R.id.fragment_devices_edit)
    }

}