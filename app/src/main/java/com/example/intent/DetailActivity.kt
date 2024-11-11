package com.example.intent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val etudiant = intent.getSerializableExtra("etudiant") as? Etudiant

        val txtNom = findViewById<TextView>(R.id.detail_nom)
        val txtAge = findViewById<TextView>(R.id.detail_age)
        val txtFilier = findViewById<TextView>(R.id.detail_filiere)



        txtNom.text = etudiant?.nomC
        txtAge.text = etudiant?.age.toString()
        txtFilier.text = etudiant?.filier
    }
}
