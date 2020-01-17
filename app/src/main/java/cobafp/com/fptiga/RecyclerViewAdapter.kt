package cobafp.com.fptiga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.view.*

class RecyclerViewAdapter (val listData : ArrayList<item>) : RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_view,parent,false)

        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val data= listData.get(position)

        holder.itemView.tv_name.text = data.name
        holder.itemView.tv_status.text = data.status
        holder.itemView.img_profile.setImageResource(data.img!!)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "yeay", Toast.LENGTH_SHORT).show()
        }
    }

    class ListViewHolder (view: View) : RecyclerView.ViewHolder(view){}

}