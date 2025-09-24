package com.example.alarmiso.ui.alarms

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.alarmiso.databinding.AlarmsFragmentBinding
import android.view.ViewGroup
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.alarmiso.R


class AlarmsFragment: Fragment() {

    private var _binding: AlarmsFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = AlarmsFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Botones para navegar en la funcionalidad

        binding.aniadirNuevaAlarma.setOnClickListener {
            findNavController().navigate(R.id.addAlarmFragment)
        }

        binding.editarAlarma.setOnClickListener {
            findNavController().navigate(R.id.editAlarmFragment)
        }

        //Barra de navegación inferior

        //User
        binding.usrBtn.setOnClickListener {
            //Todo Ir al fragmento de usr
        }

        //User
        binding.devicesBtn.setOnClickListener {
            //Todo Ir al fragmento de devices
        }

    }


}