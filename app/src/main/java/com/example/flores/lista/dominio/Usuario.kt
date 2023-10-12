package com.example.flores.lista.dominio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.flores.lista.R

class Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOKAbout = findViewById<Button>(R.id.ir_Producto)

        buttonOKAbout.setOnClickListener {
            val intentAbout = Intent(this, Producto_Compra::class.java)
            startActivity(intentAbout)
        }
    }

}