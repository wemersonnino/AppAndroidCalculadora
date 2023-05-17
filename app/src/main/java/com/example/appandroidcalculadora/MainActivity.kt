package com.example.appandroidcalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.btnMargemConsignado).setOnClickListener {
            val newIntent = Intent(this, TelaCalculadoraDeMargem::class.java)
            startActivity(newIntent)
        }
        findViewById<ImageView>(R.id.btnFGTS).setOnClickListener {
            val newIntent = Intent(this, calculadoraFGTS::class.java)
            startActivity(newIntent)
        }
    }
}