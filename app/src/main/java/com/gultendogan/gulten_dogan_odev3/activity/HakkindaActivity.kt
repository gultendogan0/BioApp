package com.gultendogan.gulten_dogan_odev3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.gultendogan.gulten_dogan_odev3.R
import kotlinx.android.synthetic.main.activity_hakkinda.*

class HakkindaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hakkinda)

        val userDrawable = ContextCompat.getDrawable(this, R.drawable.user)
        productImage.setImageDrawable(userDrawable)
        adText.setText(R.string.ad)
        soyadText.setText(R.string.soyad)
        emailText.setText(R.string.email)
    }
}


