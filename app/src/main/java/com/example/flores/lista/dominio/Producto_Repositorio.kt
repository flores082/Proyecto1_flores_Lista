package com.example.flores.lista.dominio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.Compras_lista2
import com.example.flores.lista.R
import com.example.flores.lista.listadoRepositorioadapter

class Producto_Repositorio : AppCompatActivity() {

    var Lista2 = mutableListOf<Compras_lista2>()
    lateinit var recyclerView:RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositorio)


        recyclerView = findViewById<RecyclerView>(R.id.Lista_Compras)

        initRecyclerView()

        val buttonOKAbout = findViewById<Button>(R.id.Agregar)
        val buttonOKAbout2 = findViewById<Button>(R.id.mapa)
        buttonOKAbout.setOnClickListener {
            val item = Compras_lista2(
                "Producto:",
                "Precio:$:",
                "Marca:"
            )
            Lista2.add(item)
            recyclerView.adapter?.notifyDataSetChanged()
        }
        buttonOKAbout2.setOnClickListener {
            val intentAbout = Intent(this, Lugares_Combenientes::class.java)
            startActivity(intentAbout)
        }

    }
    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.Lista_Compras)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = listadoRepositorioadapter(Lista2)


    }

}