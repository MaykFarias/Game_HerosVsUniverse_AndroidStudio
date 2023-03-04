package com.example.herosvsuniverse

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EscolhaDoVilaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_do_vilao)

        val btnEscolhaHeroi = findViewById<Button>(R.id.btnEscolhaVilao)
        btnEscolhaHeroi.setOnClickListener{
            val intent = Intent(this, RoundsActivity::class.java)
            startActivity(intent)
        }


    }
}