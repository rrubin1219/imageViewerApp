package edu.temple.imageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_activity)


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