package com.example.trabalhodeandroidcalculadora
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    /*
    * Prototipo Calculadora Financiera
    * Alunos: Wemerson Pereira: 72100290
    * Samuel Freitas: 72000830
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMargemConsignado).setOnClickListener {
            val newIntent = Intent(this, TelaCalculadoraDeMargem::class.java)
            startActivity(newIntent)
        }
        findViewById<Button>(R.id.btnFGTS).setOnClickListener {
            val newIntent = Intent(this, calculadoraFGTS::class.java)
            startActivity(newIntent)
        }
    }


}