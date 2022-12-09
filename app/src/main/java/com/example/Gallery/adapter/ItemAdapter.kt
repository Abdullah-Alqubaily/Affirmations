package com.example.Gallery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.Gallery.R
import com.example.Gallery.model.Affirmation

class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>
                  ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView.setOnClickListener { Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show() }
    }

    // تعرف عدد البيانات في القائمة
    override fun getItemCount() = dataset.size
}