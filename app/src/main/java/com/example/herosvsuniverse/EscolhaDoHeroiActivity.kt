package com.example.herosvsuniverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EscolhaDoHeroiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_do_heroi)

        val btnEscolhaHeroi = findViewById<Button>(R.id.btnEscolhaHeroi)
        btnEscolhaHeroi.setOnClickListener{
            val intent = Intent(this, EscolhaDoVilaoActivity::class.java)
            startActivity(intent)
        }


    }
}