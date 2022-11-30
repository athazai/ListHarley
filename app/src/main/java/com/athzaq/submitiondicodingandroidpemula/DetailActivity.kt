package com.athzaq.submitiondicodingandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.data_recycler_home.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DESC = "deskripsi"
        const val EXTRA_NAME = "nama"
        const val EXTRA_IMAGE = "gambar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_namaharley.text = intent.getStringExtra(EXTRA_NAME)
        txt_desc1.text = intent.getStringExtra(EXTRA_DESC)
        img_motorharley.setImageResource(intent.getStringExtra(EXTRA_IMAGE)!!.toInt())


        btn_buy.setOnClickListener {
            Toast.makeText(this@DetailActivity, "Pesanan Siap Dikirim!", Toast.LENGTH_SHORT).show()
        }


    }

}







//        val terimadataobject = "Name : $name, \nDeskripsi : $age"
//        txt_namaharley.text = terimadataobject


