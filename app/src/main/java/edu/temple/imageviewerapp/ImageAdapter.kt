import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.imageviewerapp.ImageObject
import edu.temple.imageviewerapp.R

class ImageAdapter(var _context: Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var dataList = emptyList<ImageObject>()

    internal fun setDataList(dataList: List<ImageObject>) {
        this.dataList = dataList
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image)
        var title: TextView = itemView.findViewById(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(_context).inflate(R.layout.recycler_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount() = dataList.size}