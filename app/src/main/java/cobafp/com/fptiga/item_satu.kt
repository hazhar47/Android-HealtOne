package cobafp.com.fptiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_item_satu.*

class item_satu : AppCompatActivity() {

    val listData :ArrayList<item> = arrayListOf(
        item(name = "Tomat", status = "Vitamin A, B1, C", img = R.drawable.tomato),
        item(name = "Wortel", status = "Vitamin A", img = R.drawable.carrot),
        item(name = "Jeruk", status = "Vitamin A, B1, B2, C", img = R.drawable.orange),
        item(name = "Mangga", status = "Vitamin A, E, C", img = R.drawable.mango),
        item(name = "Jambu Merah", status = "Vitamin C", img = R.drawable.guava)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_satu)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter =RecyclerViewAdapter(listData)
    }
}
