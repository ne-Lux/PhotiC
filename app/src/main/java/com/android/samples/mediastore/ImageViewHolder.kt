package com.android.samples.mediastore

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageViewHolder(view: View, onClick: (MediaStoreImage, Int) -> Unit) :
    RecyclerView.ViewHolder(view) {
    val rootView = view
    val imageView: ImageView = view.findViewById(R.id.image)

    init {
        imageView.setOnClickListener {
            val image = rootView.tag as? MediaStoreImage ?: return@setOnClickListener
            val posi = adapterPosition
            onClick(image, posi)
        }
    }
}