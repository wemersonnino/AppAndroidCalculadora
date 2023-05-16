package com.example.prototipocalculadorafinanceira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calc_Margem_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_margem)

        val percent = 35;
        val etInputSalBene = findViewById<EditText>(R.id.etInputSalario);
        val etInputParcelas = findViewById<EditText>(R.id.etInputParcelas)


        findViewById<Button>(R.id.btnCalcularMargem).setOnClickListener {
            val salBene = etInputSalBene.text.toString()
            var parcel = etInputParcelas.text.toString()

            if (salBene.isNotEmpty() && parcel.isNotEmpty()){
                val resulMergePermit = salBene.toFloat() * (percent.toFloat() / 100);
                parcel = resulMergePermit.toString();
                val resultMergeDisp = (salBene.toFloat() - parcel.toFloat());

                findViewById<TextView>(R.id.tvResultMargemPermitida).text = resulMergePermit.toString()
                findViewById<TextView>(R.id.tvResultMargemDisponivel).text = resultMergeDisp.toString()
            }
            else{
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            }


        }



        findViewById<Button>(R.id.btnVoltarMargem).setOnClickListener {
            finish();
        }
    }
}