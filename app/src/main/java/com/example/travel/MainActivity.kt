package com.example.travel

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageSwitcher
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.adapter.ImagenAdapter
import android.view.animation.AnimationUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

        //toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        // imageSwitcher
        val imageSwitcher = findViewById<ImageSwitcher>(R.id.imageSwitcher)
        imageSwitcher.setFactory { makeView() } // Asegurar que el ImageSwitcher tenga un view
        val animationIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        val animationOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out)
        imageSwitcher.inAnimation = animationIn
        imageSwitcher.outAnimation = animationOut
    }


    //Función para crear el view para el Image
    fun makeView(): View{
        val imageView = ImageView(this)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP //escala Center_Crop
        imageView.layoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        return imageView
    }

    //Método para inicializar el RecyclerView
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val decoration = DividerItemDecoration(this, manager.orientation)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val imageSwitcher = findViewById<ImageSwitcher>(R.id.imageSwitcher)

        recyclerView.layoutManager = manager
        recyclerView.adapter = ImagenAdapter(ImagenProvider.imagenList) { fotoResId ->
            imageSwitcher.setImageResource(fotoResId) // Cambia la imagen en el ImageSwitcher
        }
        recyclerView.addItemDecoration(decoration)
    }
}