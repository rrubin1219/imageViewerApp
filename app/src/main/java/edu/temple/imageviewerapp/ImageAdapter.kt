package edu.temple.imageviewerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(val _context: Context, val images: Array<ImageObject>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView= itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val imageView = ImageView(parent.context)
        return ImageViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        var items = images[position]
        holder.imageView.setImageResource(items.resourceId)
        holder.textView.text = items.description

    }

    override fun getItemCount(): Int {
        return images.size
    }
}