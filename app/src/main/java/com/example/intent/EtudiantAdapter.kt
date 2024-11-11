package com.example.intent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class EtudiantAdapter(var context: Context, val listEtudiant: List<Etudiant>) : BaseAdapter() {
    override fun getCount(): Int {
        return listEtudiant.size
    }

    override fun getItem(position: Int): Any {
        return listEtudiant[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_etudiant, parent, false)

        var txtNom = view.findViewById<TextView>(R.id.textnomC)
        var txtAge = view.findViewById<TextView>(R.id.textage)
        var txtFilier= view.findViewById<TextView>(R.id.textfiliere)
        var image= view.findViewById<ImageView>(R.id.IM)

        val etudiant = getItem(position) as Etudiant

        txtNom.text = etudiant.nomC
        txtAge.text= etudiant.age.toString()
        txtFilier.text = etudiant.filier
        image.setImageResource(etudiant.image)

        return view
    }
}