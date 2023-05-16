package com.example.trabalhodeandroidcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import com.example.prototipocalculadorafinanceira.Adapter.ValoresAdapter
import com.example.prototipocalculadorafinanceira.model.Valores

class calculadoraFGTS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_fgts)
        val taxJurM = 0.0025;
        val taxDeposito = 0.08;

        val etInputSalBrut = findViewById<EditText>(R.id.etInputSalBrut)
        val etInputSalAnt = findViewById<EditText>(R.id.etInputSalAnt)
        val dateInicial = findViewById<EditText>(R.id.edInputDateInit)
        val dateFinal = findViewById<EditText>(R.id.edInputDateFim)
        val rbAddJuros = findViewById<RadioButton>(R.id.rbAddJuros)

        findViewById<Button>(R.id.btnCalcFGTS).setOnClickListener {
            val salarioBrut = etInputSalBrut.text.toString();
            val saldoAnterior = etInputSalAnt.text.toString();
            val dataInit = dateInicial.text.toString();
            val datafinal = dateFinal.text.toString();
            val checkboxJuros = rbAddJuros.text.toString();

            if (salarioBrut.isNotEmpty() && saldoAnterior.isNotEmpty() && dataInit.isNotEmpty() && datafinal.isNotEmpty()){
                depMensal(salarioBrut);
            }

        }

        // Busca o elemento listview na tela
        val listview = findViewById<ListView>(R.id.listViewResult)

        // Monta a lista a ser exibida na tela
        val listarValores = geraValores()

        // Instancia o adapter
        val adapter = ValoresAdapter(this, listarValores)


        listview.adapter = adapter
    }

    fun depMensal(v: String): Double {
        val taxDeposito = 0.08
        val result = v.toFloat() * taxDeposito;
        return result
    }

    fun dataDifMs(dateInicial:String, dateFinal:String):Int{
        val dataT = dateInicial.format("MMM",dateInicial)
        val dataF = dateFinal.format("MMM",dateFinal)
        val dataTa = dateInicial.format("yyyy",dateInicial)
        val dataFa = dateFinal.format("yyyy",dateFinal)
        val resultDatDif = (dataFa.toInt() - dataTa.toInt()) * 12 + (dataF.toInt() - dataT.toInt()) + 1;
        return resultDatDif;
    }
    fun depTotal(dpMes:Double, mesContrib:Double): String {
        val resultDepTotal = (dpMes.toFloat() * mesContrib.toFloat())
        return resultDepTotal.toString()
    }

    fun depTotalJuros(dpMes:Double, taxJurM:Double, mesContrib: Double):String{
        val resultDepTotalWithJuros = dpMes.toFloat() * (Math.pow((1 + taxJurM), mesContrib) -1 ) / taxJurM;
        return resultDepTotalWithJuros.toString()
    }
    fun saldoFinal(dpT:Float, salAnt:Float):String{
        val resultSaldoFinalSemJuros = (dpT.toFloat() + salAnt.toFloat())
        return resultSaldoFinalSemJuros.toString();
    }
    fun saldoFinalJ(salAnt:Double, taxJurM: Double, mesContrib: Double, dpT:Double):String{
        val resultSaldoFinalJ = salAnt.toFloat() * Math.pow((1 + taxJurM),mesContrib) + dpT;
        return resultSaldoFinalJ.toString();
    }

    fun geraValores() :ArrayList<Valores> {
        val lista = ArrayList<Valores>()

        for (i in 0..99) {
            var valor = Valores()
            valor.depositoMensal = 12587.25
            valor.mesContribuicao = i
            valor.depositoTotal = 1200.0
            valor.saldoFinal = 8.758

            lista.add(valor)
        }

        return lista
    }
}