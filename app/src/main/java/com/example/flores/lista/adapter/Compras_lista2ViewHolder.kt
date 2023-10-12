package com.example.flores.lista.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.Compras_lista2
import com.example.flores.lista.R


class Compras_lista2ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val Producto = view.findViewById<TextView>(R.id.Producto)
    val Precio = view.findViewById<TextView>(R.id.Precio)
    val Marca = view.findViewById<TextView>(R.id.Marca)

    fun render(Compras_lista2Model: Compras_lista2){
        Producto.text = Compras_lista2Model.producto2
        Precio.text = Compras_lista2Model.precio2
        Marca.text = Compras_lista2Model.marca2

    }
}
