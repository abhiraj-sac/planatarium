package com.example.planatarium

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*
import java.util.*

class Adapter(var planet:List<PlanetData>): RecyclerView.Adapter<Adapter.myviewholder>() {
    class myviewholder(view: View) : RecyclerView.ViewHolder(view) {
 var title =view.title
        var planetimg=view.planet
        var galaxy=view.galaxy
        var distance=view.distance
        var gravity=view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
  val itemview = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return myviewholder(itemview)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        var dummyimage: Int? =null
        holder.itemView.setOnClickListener{
            val intent =Intent(holder.itemView.context,planetactivity::class.java)
            intent.putExtra("data",planet[position])
            intent.putExtra("image",dummyimage)
            holder.itemView.context.startActivity(intent)
        }


     holder.title.text =planet[position].title
     holder.galaxy.text =planet[position].galaxy
     holder.distance.text =planet[position].distance
     holder.gravity.text =planet[position].gravity
        when(planet[position].title!!.lowercase()){
            "mars"->{
                dummyimage = R.drawable.mars
            }
            "neptune"->{
                dummyimage = R.drawable.neptune
            }
            "jupiter"->{
                dummyimage = R.drawable.jupiter
            }
            "sun"->{
                dummyimage = R.drawable.sun
            }
            "earth"->{
                dummyimage = R.drawable.earth
            }
            "mercury"->{
                dummyimage = R.drawable.mercury
            }
            "uranus"->{
                dummyimage = R.drawable.uranus
            }
            "venus"->{
                dummyimage = R.drawable.venus
            }
            "moon"->{
                dummyimage = R.drawable.moon
            }
<<<<<<< HEAD
=======
            "saturn"->{
                dummyimage = R.drawable.saturn
            }
>>>>>>> b19be18 (Initial commit)

        }
        holder.planetimg.setImageResource(dummyimage!!)
    }


    override fun getItemCount(): Int {
 return planet.size
    }
}

