package com.example.prototipocalculadorafinanceira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prototipocalculadorafinanceira.model.Valores

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMargemConsignado).setOnClickListener {
            val newIntent = Intent(this, Calc_Margem_Activity::class.java)
            startActivity(newIntent)
        }


    }

}