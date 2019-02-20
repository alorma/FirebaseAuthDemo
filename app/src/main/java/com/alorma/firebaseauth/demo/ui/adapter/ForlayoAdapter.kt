package com.alorma.firebaseauth.demo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alorma.firebaseauth.demo.ui.model.ForlayoVM

class ForlayoAdapter : ListAdapter<ForlayoVM, ForlayoAdapter.ForlayoHolder>(DIFF) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForlayoHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(android.R.layout.simple_list_item_2, parent, false)
        return ForlayoHolder(view)
    }

    override fun onBindViewHolder(holder: ForlayoHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ForlayoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: ForlayoVM) {
            itemView.findViewById<TextView>(android.R.id.text1).text = item.text
            itemView.findViewById<TextView>(android.R.id.text2).text = item.subText
        }
    }

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<ForlayoVM>() {
            override fun areItemsTheSame(oldItem: ForlayoVM, newItem: ForlayoVM): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: ForlayoVM, newItem: ForlayoVM): Boolean =
                oldItem.text == oldItem.text
        }
    }

}