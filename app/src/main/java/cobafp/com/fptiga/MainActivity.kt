package cobafp.com.fptiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.set_berat
import kotlinx.android.synthetic.main.activity_main.set_nama
import kotlinx.android.synthetic.main.activity_main.set_tinggi
import kotlinx.android.synthetic.main.activity_profile.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val strNama = intent.getStringExtra("NAMA")
        val strTinggi = intent.getStringExtra("TINGGI")
        val strBerat = intent.getStringExtra("BERAT")

        set_nama.text = strNama
        set_tinggi.text = strTinggi
        set_berat.text = strBerat

        cv_profile.setOnClickListener {
            val intent = Intent(this, profile::class.java)

            startActivity(intent)
        }

        cv_satu.setOnClickListener {
                val intent = Intent(this, item_satu::class.java)

            startActivity(intent)
        }

        cv_dua.setOnClickListener {
            val intent = Intent(this, item_dua::class.java)

            startActivity(intent)
        }

        cv_tiga.setOnClickListener {
            val intent = Intent(this, item_tiga::class.java)

            startActivity(intent)
        }
    }
}
