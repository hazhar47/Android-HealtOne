package cobafp.com.fptiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        btn_login2.setOnClickListener {
            val strNama = edt_nama.text.toString()
            val strTinggi = edt_tinggi.text.toString()
            val strBerat = edt_berat.text.toString()

            val intent = Intent(this, profile::class.java)

            intent.putExtra("NAMA", strNama)
            intent.putExtra("TINGGI", strTinggi)
            intent.putExtra("BERAT", strBerat)

                startActivity(intent)
        }
    }
}
