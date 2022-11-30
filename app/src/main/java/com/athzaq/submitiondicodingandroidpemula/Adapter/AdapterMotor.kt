package com.athzaq.submitiondicodingandroidpemula.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.athzaq.submitiondicodingandroidpemula.DetailActivity
import com.athzaq.submitiondicodingandroidpemula.MainActivity
import com.athzaq.submitiondicodingandroidpemula.Model.Motor
import com.athzaq.submitiondicodingandroidpemula.R
import com.bumptech.glide.Glide

class AdapterMotor(private val listdataMotor : ArrayList<Motor>) : RecyclerView.Adapter<AdapterMotor.ListViewHolder>() {
    class ListViewHolder(itemWidget : View) : RecyclerView.ViewHolder(itemWidget){
        var txt_nama : TextView = itemWidget.findViewById(R.id.txt_nama)
        var txt_deskripsi : TextView = itemWidget.findViewById(R.id.txt_deskripsi)
        var gbrmotor : ImageView = itemWidget.findViewById(R.id.img_motor)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            val layout: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.data_recycler_home, parent, false)
        return ListViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val motor = listdataMotor[position]
        Glide.with(holder.itemView.context)
            .load(motor.gambar)
            .into(holder.gbrmotor)
        holder.txt_nama.text = motor.name
        holder.txt_deskripsi.text = motor.deskripsi

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_NAME, motor.name)
            intent.putExtra(DetailActivity.EXTRA_DESC, motor.deskripsi)
            intent.putExtra(DetailActivity.EXTRA_IMAGE, motor.gambar.toString())
            it.context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
        return listdataMotor.size
    }
}
