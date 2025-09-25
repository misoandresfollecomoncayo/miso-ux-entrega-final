package com.example.alarmiso.ui.devices

import com.example.alarmiso.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alarmiso.models.Device
import com.example.alarmiso.ui.alarms.Fragment_Devices

class DeviceAdapter(private val devices: List<Device>, private val fragmentDevices: Fragment_Devices) :
    RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder>() {

    class DeviceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvConnected: TextView = itemView.findViewById(R.id.tvConnected)

        val btnEdit: ImageButton = itemView.findViewById(R.id.editarAlarma)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.component_device_item, parent, false)
        return DeviceViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeviceViewHolder, position: Int) {
        val device = devices[position]
        holder.tvName.text = device.name
        if (device.connected) {
            holder.tvConnected.text = "Conectado"
        } else {
            holder.tvConnected.text = "No conectado"
        }
        holder.btnEdit.setOnClickListener {
            fragmentDevices.editarDispositivo()
        }
    }

    override fun getItemCount(): Int = devices.size

}