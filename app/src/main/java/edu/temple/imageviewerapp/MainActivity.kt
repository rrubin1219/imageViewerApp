import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.temple.imageviewerapp.ImageObject
import edu.temple.imageviewerapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var  imageAdapter: ImageAdapter
    private var items = ArrayList<ImageObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_activity)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,3)
        recyclerView.adapter = ImageAdapter(applicationContext)

        //add data
        imageAdapter.setDataList(getItems())
    }

    private fun getItems() : ArrayList<ImageObject> {
        items.add(ImageObject("Making Dinner", R.drawable.microwave))
        items.add(ImageObject("Hide n' Seek", R.drawable.hide_n_seek))
        items.add(ImageObject("Laundry Day", R.drawable.laundry))
        items.add(ImageObject("Getting Cuddly", R.drawable.cuddles))
        items.add(ImageObject("Ordering Takeout", R.drawable.food_prep))
        items.add(ImageObject("Confused", R.drawable.shocked))
        items.add(ImageObject("Sleepy", R.drawable.sleepy))
        items.add(ImageObject("Hunter", R.drawable.stalker))
        items.add(ImageObject("Tunneling Around", R.drawable.tunnel))
        items.add(ImageObject("Hard at Work", R.drawable.worker))

        return items


    }
}