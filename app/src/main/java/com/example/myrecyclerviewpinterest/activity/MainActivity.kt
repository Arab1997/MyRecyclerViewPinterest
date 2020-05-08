package com.example.baseactivity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.*

import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.model.Member
import com.example.myrecyclerviewpinterest.R
import kotlinx.android.synthetic.main.activity_main.*
import my.mytoolbarscrolleffect.helper.SpaceItemDecoration

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initView() {
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val decoration = SpaceItemDecoration(10)
        recyclerView.addItemDecoration(decoration)
    }

    private fun refreshAdapter(members:List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
    }
    private fun prepareMemberList(): ArrayList<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
                members.add(Member("Makhmudov" + i, "Abdulloh" + i))
        }
        return members
    }
}


