package com.gultendogan.gulten_dogan_odev3.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gultendogan.gulten_dogan_odev3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Emülatörde çalıştırınca resimler gelmesinde ve webView açılmasında sıkıntı olabiliyor.
        //Lakin gerçek cihazda test ettiğimde hiçbir sorun olmadan çalışmakta :)

        button2.setOnClickListener {
            startActivity(Intent(this, HakkindaActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, GaleriActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this, IletisimActivity::class.java))
        }

        button5.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
    }
}