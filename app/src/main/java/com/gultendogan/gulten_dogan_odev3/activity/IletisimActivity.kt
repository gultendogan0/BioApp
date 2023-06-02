package com.gultendogan.gulten_dogan_odev3.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gultendogan.gulten_dogan_odev3.R

class IletisimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iletisim)

        val textView = findViewById<TextView>(R.id.textview)

        textView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(textView.text.toString())
            startActivity(intent)
        }
    }
}