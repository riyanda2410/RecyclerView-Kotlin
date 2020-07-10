package com.example.recyclerviewkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model) {
            itemView.titleTV.text = model.title
            itemView.descriptionTV.text = model.des
            itemView.imageTV.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            //get position of selected item
            val model = arrayList.get(position)
            //get title and description of selected item with intent
            var gTitle : String = model.title
            var gDescription : String = model.des
            //get image with intent, which position is selected
            var gImageView : Int = model.image

            //create intent in kotlin
            val intent = Intent(context, AnotherActivity::class.java)
            //now put all these items with putExtra intent
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDescription", gDescription)
            intent.putExtra("iImageView", gImageView)
            //Start another activity
            context.startActivity(intent)
        }
    }
}