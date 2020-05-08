package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.baseactivity.activity.MainActivity
import com.example.myapplication.model.Member
import com.example.myrecyclerviewpinterest.R


//class CustomAdapter(val members: ArrayList<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(), ItemTouchHelperAdapter{ //Paging  add method val listener: OnBottomReachedListener
class CustomAdapter(private val context: Context, private val members: List<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //Paging  add method val listener: OnBottomReachedListener

    override fun getItemCount(): Int {
        return members.size
    }

    // -------------------- Hohlagan turdagi listni hosil qiladi-------------------------//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)
        val (firstName, lastName) = members[position]

        if (holder is CustomViewHolder) {
            if (position % 3 == 0) {
                holder.item_image.setImageResource(R.drawable.img1)
            } else if(position % 4 == 0){
                holder.item_image.setImageResource(R.drawable.img4)
            }else{
                holder.item_image.setImageResource(R.drawable.img210)
            }
        }
    }

    class CustomViewHolder(iteView: View) : RecyclerView.ViewHolder(iteView) {
        var item_image = itemView.findViewById<ImageView>(R.id.item_image)
        /*var view_background = itemView.findViewById<TextView>(R.id.view_background)*/
    }


}






