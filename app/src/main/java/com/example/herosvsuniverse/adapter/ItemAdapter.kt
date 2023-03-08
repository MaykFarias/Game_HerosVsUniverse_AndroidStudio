package com.example.herosvsuniverse.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.herosvsuniverse.model.Lutas
import com.example.herosvsuniverse.R

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Lutas>,
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imagemHeroi: ImageView = view.findViewById(R.id.imgHeroi)
        val imagemVilao: ImageView = view.findViewById(R.id.imgVilao)
        val ataqueHeroi: TextView = view.findViewById(R.id.acaoDoHeroi)
        val ataqueVilao: TextView = view.findViewById(R.id.acaoDoVilao)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_luta, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imagemHeroi.setImageResource(item.imageResourceId)
        holder.imagemVilao.setImageResource(item.imageResourceIdHeroi)
        holder.ataqueHeroi.setText(item.stringResourceId)
        holder.ataqueVilao.setText(item.stringResourceIdHeroi)
    }

    override fun getItemCount() = dataset.size
}
