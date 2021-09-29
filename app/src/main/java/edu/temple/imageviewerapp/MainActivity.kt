package edu.temple.imageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_activity)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val description = findViewById<TextView>(R.id.textView)
        val image = findViewById<ImageView>(R.id.image)

        recycler.adapter = ImageAdapter(getImages())

    }
    fun getImages() : Array<ImageObject>{
        val images = arrayOf(
            ImageObject("Making Dinner", R.drawable.microwave)
        )
    }
}

/*
* define listener in activity
* pass it to adapter
*
* class ImageAdapter(): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
*   class ImageViewHolder(_imageView: ImageView):RecyclerView.ViewHolder(_imageView){
*      val imageView = _imageView
*   }
*
*   onCreateViewHolder(parent:ViewGroup, viewType:Int:imageViewHOlder{
*       val imageView = ImageView(parent.context)
*   return ImageViewHolder(imageView)
*   }
*
*   onBindViewHolder(holder: ImageViewHolder, position: Ine){
*
*   }
* getItemCount
* }
*
* class Stack<T>(t: T){
*   val someValue = t
*
*   fun pop() : T{
*       return someValue
*   }
*   fun push(t:T){
*       someValue = t
*   }
*
*}
*
*
*
* myStack = Stack<String>("hello")
* myStack.push
* */