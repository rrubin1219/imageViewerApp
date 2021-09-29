package edu.temple.imageviewerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val images: Array<ImageObject>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    class ImageViewHolder(Image: View) : RecyclerView.ViewHolder(Image) {
        val imageView: ImageView= itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        //val imageView = ImageView(parent.context)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout, parent, false)
        //val desc =
        //return ImageViewHolder(imageView)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val items = images[position]
        holder.imageView.setImageResource(items.resourceId)
        holder.textView.text = items.description

    }

    override fun getItemCount(): Int {
        return images.size
    }
}