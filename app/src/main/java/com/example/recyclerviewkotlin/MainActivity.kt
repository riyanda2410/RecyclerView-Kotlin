package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Android Development", "This is Android Development description", R.drawable.android))
        arrayList.add(Model("IOS Development", "This is IOS Development description", R.drawable.ios))
        arrayList.add(Model("Game Development", "This is Game Development description", R.drawable.game))
        arrayList.add(Model("WEB Development", "This is WEB Development description", R.drawable.web))
        arrayList.add(Model("IOT Development", "This is IOT Development description", R.drawable.iot))
        arrayList.add(Model("UIUX", "This is UIUX description", R.drawable.uiux))
        arrayList.add(Model("Computer Vision", "This is Computer Vision description", R.drawable.vision))

        val myAdapter = MyAdapter(arrayList, this)

        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = myAdapter
    }
}