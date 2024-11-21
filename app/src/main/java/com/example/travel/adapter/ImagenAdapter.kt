package com.example.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.Imagen
import com.example.travel.R


class ImagenAdapter (
    private val ImagenList: List<Imagen>,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.Adapter<ImagenViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagenViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ImagenViewHolder(layoutInflater.inflate(R.layout.imagen_item, parent, false))
    }

    override fun onBindViewHolder(holder: ImagenViewHolder, position: Int) {
        val item = ImagenList[position]
        holder.render(item)
        holder.itemView.setOnClickListener { onImageClick(item.foto) }
    }

    override fun getItemCount(): Int = ImagenList.size
}
