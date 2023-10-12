package com.example.flores.lista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.adapter.Compras_lista2ViewHolder


class listadoRepositorioadapter(private val LP:List<Compras_lista2>)
    : RecyclerView.Adapter<Compras_lista2ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Compras_lista2ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return Compras_lista2ViewHolder(layoutInflater.inflate(R.layout.items_compras2, parent, false))

    }

    override fun onBindViewHolder(holder: Compras_lista2ViewHolder, position: Int) {
        val item = LP[position]
        holder.render(item)

        
    }

    override fun getItemCount(): Int = LP.size
}