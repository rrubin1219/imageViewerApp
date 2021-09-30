package edu.temple.imageviewerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val _context: MainActivity, private val images: ArrayList<ImageObject>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val imageView = LayoutInflater.from(_context).inflate(R.layout.recycler_layout, parent, false)
        return ImageViewHolder(imageView)
    }
    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val items = images[position]
        holder.imageView.setImageResource(items.resourceId)
        holder.textView.text = items.description

        holder.imageView.setOnClickListener {
            Toast.makeText(_context, "You Clicked the it", Toast.LENGTH_SHORT).show()
        }
    }
    override fun getItemCount() = images.size

    class ImageViewHolder(Image: View) : RecyclerView.ViewHolder(Image) {
        val imageView: ImageView= itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}