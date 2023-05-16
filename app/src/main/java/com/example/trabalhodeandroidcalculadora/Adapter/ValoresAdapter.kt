package com.example.prototipocalculadorafinanceira.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.prototipocalculadorafinanceira.model.Valores
import com.example.trabalhodeandroidcalculadora.R

class ValoresAdapter(val contexto: Context, val lista: ArrayList<Valores>) : BaseAdapter() {
    //Retorna o tamanho da lista
    override fun getCount(): Int {
        return lista.size
    }

    // retorna o elemento que esta sendo montado
    override fun getItem(p0: Int): Any {
        return lista[p0]
    }

    // retorna o id da lista no formato long
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    //Metodo responsável por criar a view e fazer o bind dos elementos na tela
    override fun getView(p0: Int, paramView: View?, viewGroup: ViewGroup?): View {
        val view = LayoutInflater.from(contexto).inflate(R.layout.activity_valores_list_fgts, viewGroup, false)

        val valor = lista[p0]

        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = valor.depositoMensal.toString()

        view.findViewById<TextView>(R.id.tvValDepMensal).text = "Depósito mensal: ${valor.depositoMensal}"
        view.findViewById<TextView>(R.id.tvValMesContrib).text = "Meses de contribuição ${valor.mesContribuicao}"
        view.findViewById<TextView>(R.id.tvValDepTotal).text = "Depósito total ${valor.depositoTotal}"
        view.findViewById<TextView>(R.id.tvValDepFinal).text = "Depósito total ${valor.saldoFinal}"

        return view
    }
}