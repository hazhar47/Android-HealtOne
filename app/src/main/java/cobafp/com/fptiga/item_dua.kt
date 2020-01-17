package cobafp.com.fptiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_item_satu.*

class item_dua : AppCompatActivity() {

    val listData :ArrayList<item> = arrayListOf(
        item(name = "Bayam", status = "Vitamin A, C, K", img = R.drawable.spinach),
        item(name = "Kangkung", status = "Vitamin A, C", img = R.drawable.spinach),
        item(name = "Pare", status = "Vitamin A, C", img = R.drawable.salad),
        item(name = "Wortel", status = "Vitamin A, B1, B2, C", img = R.drawable.carrot),
        item(name = "Tauge", status = "Vitamin A, B, C, E", img = R.drawable.sprout)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_dua)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter =RecyclerViewAdapter(listData)
    }
}
