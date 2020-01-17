package cobafp.com.fptiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_item_satu.*

class item_tiga : AppCompatActivity() {

    val listData :ArrayList<item> = arrayListOf(
        item(name = "Pistachio", status = "Vitamin B6", img = R.drawable.bean),
        item(name = "Mete", status = "Zat Seng", img = R.drawable.beans),
        item(name = "Pecan", status = "60% Lemak tak Jenuh Tunggal", img = R.drawable.bean),
        item(name = "Kedelai", status = "Vitamin K", img = R.drawable.bean),
        item(name = "Almond", status = "Vitamin E", img = R.drawable.almond)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_tiga)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter =RecyclerViewAdapter(listData)
    }
}
