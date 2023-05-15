package com.example.aulaandroid_calculadora

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.aulaandroid_calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etResultado = findViewById<EditText>(R.id.etResultado)

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "1")
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "2")
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "3")
        }
        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "4")
        }
        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "5")
        }
        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "6")
        }
        val btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "7")
        }
        val btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "8")
        }
        val btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "9")
        }
        val btn0 = findViewById<Button>(R.id.btn0)
        btn0.setOnClickListener {
            etResultado.setText(etResultado.text.toString() + "0")
        }
    }


}

