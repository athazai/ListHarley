package com.athzaq.submitiondicodingandroidpemula.Data

import com.athzaq.submitiondicodingandroidpemula.Model.Motor
import com.athzaq.submitiondicodingandroidpemula.R

object DataMotor {
    private val NamaMotor = arrayOf(
        "Road Glide Limited",
        "Road Glide",
        "Street Bob",
        "Fatboy",
        "Iron 833",
        "Breakout",
        "Road King Special",
        "Street glide Special",
        "Forty-Eight",
        "Road Glide Special"
    )
    private val Deskripsi = arrayOf(
        "Kapasitas terbesar dalam model Harley Touring standar. Anda akan mendapatkan daya salip dan melaju pada kecepatan tinggi berkat mesin 114 inci kubik.",
        "Kapasitas paling besar dalam model H-D™ Touring standar. Anda akan mendapatkan daya salip dan melaju pada kecepatan tinggi berkat mesin 114 inci kubik.",
        "Muatan torsi yang sangat bertenaga untuk melaju setelah lampu lalu lintas menyala hijau, menikung, dan berjalan dengan daya salip. Suara jernih dengan deru mesin asli yang begitu khas.",
        "Mesin yang bertenaga dan mulus dengan respons trotel yang tajam serta deru yang murni dan penuh semangat.",
        "Gaya autentik Harley-Davidson penuh tenaga. Mesin Evolution™ 883 cc yang dipasang pada dudukan karet berjalan mulus dan kuat selama perjalanan jauh, sehingga Anda hanya perlu menikmati kebebasan di jalan besar dan jalan di pinggiran kota.",
        "Muatan torsi yang sangat bertenaga untuk melaju setelah lampu lalu lintas menyala hijau, menikung, dan berjalan dengan daya salip. Suara jernih dengan deru mesin asli yang begitu khas.",
        "Kapasitas terbesar dalam model H-D™ Touring standar. Anda akan mendapatkan daya salip dan melaju pada kecepatan tinggi berkat mesin 114 inci kubik.",
        "Kapasitas terbesar dalam model H-D™ Touring standar. Anda akan mendapatkan daya salip dan melaju pada kecepatan tinggi berkat mesin 114 inci kubik.",
        "Mesin V-Twin ikonis yang terkenal berkat torsinya yang bekerja lebih baik pada kecepatan rendah serta suara derum yang menggetarkan jiwa. Kepala dan silinder berbahan aluminium ringan menghadirkan efisiensi pendingin udara yang meningkat.",
        "Kapasitas terbesar dalam model H-D™ Touring standar. Anda akan mendapatkan daya salip dan melaju pada kecepatan tinggi berkat mesin 114 inci kubik.",
    )
    private val GambarMotor = intArrayOf(
        R.drawable.harleyultralimited,
        R.drawable.roadglide,
        R.drawable.streetbobmiring,
        R.drawable.fatboymiring,
        R.drawable.iron833miring,
        R.drawable.breakoutmiring,
        R.drawable.roadkings,
        R.drawable.streetglidespecialmiring,
        R.drawable.spostermiring,
        R.drawable.roadglidespecialmiring,
    )

    val listdatamotor : ArrayList<Motor>
        get() {
            val list = arrayListOf<Motor>()
            for (position in NamaMotor.indices) {
                val motor = Motor()
                motor.name = NamaMotor[position]
                motor.deskripsi = Deskripsi[position]
                motor.gambar = GambarMotor[position]
                list.add(motor)
            }
            return list
        }
}