package com.gultendogan.gulten_dogan_odev3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.gultendogan.gulten_dogan_odev3.R
import com.gultendogan.gulten_dogan_odev3.adapter.UserCustomAdapter
import com.gultendogan.gulten_dogan_odev3.service.UserService

class GaleriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        lateinit var listView: ListView
        val userService = UserService()

        listView = findViewById(R.id.userListView)
        val customAdapter = UserCustomAdapter(this, userService.userResult())
        listView.adapter = customAdapter
    }
}