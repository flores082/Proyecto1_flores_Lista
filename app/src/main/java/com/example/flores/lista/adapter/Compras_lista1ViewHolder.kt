package com.example.flores.lista.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.Compras_lista1
import com.example.flores.lista.R
import java.awt.font.TextAttribute


class Compras_lista1ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val Producto = view.findViewById<TextView>(R.id.Producto)
    val Precio = view.findViewById<TextView>(R.id.Precio)
    val Marca = view.findViewById<TextView>(R.id.Marca)

    fun render(Compras_lista1Model: Compras_lista1){
        Producto.text = Compras_lista1Model.producto
        Precio.text = Compras_lista1Model.precio
        Marca.text = Compras_lista1Model.marca

    }
}
