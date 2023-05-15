package com.example.trabalhodeandroidcalculadora
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botaoMargemConsignado = findViewById<ImageView>(R.id.btnMargemConsignado)
        botaoMargemConsignado.setOnClickListener {
            val i = Intent(this, TelaCalculadoraDeMargem::class.java)
            startActivity(i)
        }
      val botaoFGTS = findViewById<ImageView>(R.id.btnFGTS)
        botaoFGTS.setOnClickListener {
            val i = Intent(this, calculadoraFGTS::class.java)
            startActivity(i)
        }
    }


}