package com.example.travel

/**
 * Clase ImagenProvider que contiene una lista de objetos Imagen
 */
class ImagenProvider {
    companion object {
        val imagenList = listOf<Imagen>(
            Imagen(R.drawable.image1),
            Imagen(R.drawable.image2),
            Imagen(R.drawable.image3),
            Imagen(R.drawable.image4),
            Imagen(R.drawable.image5),
            Imagen(R.drawable.image6),
            Imagen(R.drawable.image7),
            Imagen(R.drawable.image8),
            Imagen(R.drawable.image9),
            Imagen(R.drawable.image10)
        )
    }
}