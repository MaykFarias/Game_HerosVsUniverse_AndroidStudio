package com.example.herosvsuniverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.herosvsuniverse.model.Lutas

class ApresentacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apresentacao)

        val btnEscolhaHeroi = findViewById<Button>(R.id.button2)
        btnEscolhaHeroi.setOnClickListener{
            val intent = Intent(this, LutaActivity::class.java)
            startActivity(intent)
        }
    }
}