package com.gultendogan.gulten_dogan_odev3.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.gultendogan.gulten_dogan_odev3.R
import com.gultendogan.gulten_dogan_odev3.model.User

class UserCustomAdapter(private val context: Activity, private val list: List<User>) : ArrayAdapter<User>(context,R.layout.custom_list_item, list ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item, null, true)

        val r_image = rootView.findViewById<ImageView>(R.id.r_img)

        val user = list.get(position)

        Glide.with(rootView).load(user.image).into(r_image)

        return rootView
    }


}