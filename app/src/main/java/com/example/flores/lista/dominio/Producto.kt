package com.example.flores.lista.dominio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flores.lista.Compras_lista1
import com.example.flores.lista.R
import com.example.flores.lista.listadoCompraadapter

class Producto : AppCompatActivity() {

    var Lista = mutableListOf<Compras_lista1>()
    //var onClick = IntArray<Compras_lista1>()
    lateinit var recyclerView:RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compras)


        val editText=findViewById<EditText>(R.id.editTextText)
        val editText2=findViewById<EditText>(R.id.editTextText2)
        val editText3=findViewById<EditText>(R.id.editTextText3)

        recyclerView = findViewById<RecyclerView>(R.id.Lista_Compras1)

        initRecyclerView()

        val buttonOKAbout = findViewById<Button>(R.id.Agregar)
        val buttonOKAbout2 = findViewById<Button>(R.id.Lista2)
        buttonOKAbout.setOnClickListener {
            val item = Compras_lista1(
                "Producto:"+editText.text,
                "Precio:$:"+editText2.text,
                "Marca:"+editText3.text
            )
            Lista.add(item)
            recyclerView.adapter?.notifyDataSetChanged()
        }
        buttonOKAbout2.setOnClickListener {
            val intentAbout = Intent(this, Lista_Compra::class.java)
            startActivity(intentAbout)
        }

    }
    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.Lista_Compras1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = listadoCompraadapter(Lista/*,onClick*/)
    }

}
