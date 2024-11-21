package com.example.travel.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.Imagen
import com.example.travel.R

class ImagenViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Elementos de la vista que se van a mostrar
    val imagen = view.findViewById<ImageView>(R.id.imageViewItem)

    // Método para enlazar los datos del objeto Imagen con los elementos de la vista
    fun render(img: Imagen){
        imagen.setImageResource(img.foto)
    }
}
