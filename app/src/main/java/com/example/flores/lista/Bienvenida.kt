package com.example.flores.lista

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.flores.lista.dominio.Usuario


class Bienvenida : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        VerBienvenida()
        }

        fun VerBienvenida() {
                object : CountDownTimer(2000, 1000) {
                        override fun onTick(p0: Long) {

                        }

                        override fun onFinish() {
                                val intent = Intent(this@Bienvenida, Usuario::class.java)
                                startActivity(intent)
                                finishAffinity()
                        }

                }.start()
        }
}

