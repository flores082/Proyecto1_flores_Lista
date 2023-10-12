package com.example.flores.lista

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.adapter.Compras_lista1ViewHolder
class listadoCompraadapter(private val LC:List<Compras_lista1>)
    : RecyclerView.Adapter<Compras_lista1ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Compras_lista1ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return Compras_lista1ViewHolder(layoutInflater.inflate(R.layout.items_compras, parent, false))

    }

    override fun onBindViewHolder(holder: Compras_lista1ViewHolder, position: Int) {
        val item = LC[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = LC.size
}