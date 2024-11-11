package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listE = listOf(
            Etudiant("Ahemed Yassine", 25, "DevOAM",R.drawable.download),
            Etudiant("Ahemed Yassine", 25, "DevOAM",R.drawable.download),
            Etudiant("Ahemed Yassine", 25, "DevOAM",R.drawable.download),
            Etudiant("Ahemed Yassine", 25, "DevOAM",R.drawable.download)
        )

        val lv = findViewById<ListView>(R.id.lv)
        val adapter = EtudiantAdapter(this, listE)
        lv.adapter = adapter

        // Lorsqu'un étudiant est cliqué, on démarre DetailActivity avec l'objet Etudiant sélectionné
        lv.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedEtudiant = listE[position]
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("etudiant", selectedEtudiant)
            }
            startActivity(intent)
        }
    }
}
