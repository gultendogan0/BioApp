package com.gultendogan.gulten_dogan_odev3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gultendogan.gulten_dogan_odev3.R
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        webview.loadUrl("https://github.com/gultendogan0")
    }
}