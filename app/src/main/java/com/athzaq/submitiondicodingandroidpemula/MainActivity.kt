package com.athzaq.submitiondicodingandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.athzaq.submitiondicodingandroidpemula.Adapter.AdapterMotor
import com.athzaq.submitiondicodingandroidpemula.Data.DataMotor
import com.athzaq.submitiondicodingandroidpemula.Model.Motor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list : ArrayList<Motor> = arrayListOf()
    private lateinit var rvMotor : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMotor = findViewById(R.id.recycler_motor)
        recycler_motor.setHasFixedSize(true)
        list.addAll(DataMotor.listdatamotor)
        tampilkanRecylerView()

    }

    private fun tampilkanRecylerView() {
        recycler_motor.layoutManager = GridLayoutManager(this, 1)
        val listMotor = AdapterMotor(list)
        rvMotor.adapter = listMotor
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menumain, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(milihitem: Int) {
        when(milihitem){
            R.id.menu_profile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }
}
