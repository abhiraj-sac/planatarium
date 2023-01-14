package com.example.planatarium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_planetactivity.*

class planetactivity : AppCompatActivity() {
    private lateinit var obj:PlanetData
    private  var planetimg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetactivity)

           obj= intent.getParcelableExtra("data")!!
  planetimg =intent.getIntExtra("image",-1)
  setdata(obj, planetimg!!)
    }
    private fun setdata(obj:PlanetData,planetimg:Int) {
 title_info.text = obj.title
        text_overview.text=obj.overview
        planet_info.setImageResource(planetimg)
    }
}