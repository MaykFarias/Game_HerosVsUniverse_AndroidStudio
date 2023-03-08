package com.example.herosvsuniverse

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.herosvsuniverse.model.Lutas
import java.sql.DatabaseMetaData

class ApresentacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apresentacao)

        val btnEscolhaHeroi = findViewById<Button>(R.id.botaoProximo)
        btnEscolhaHeroi.setOnClickListener{
            val intent = Intent(this, LutaActivity::class.java)
            startActivity(intent)
        }

        var txtNomeHeroi = findViewById<TextView>(R.id.txtNomeHeroi)
        var imgHeroi = findViewById<ImageView>(R.id.imgHeroi)
        var txtNomeVilaov = findViewById<TextView>(R.id.txtNomeVilao)
        var imgVilao = findViewById<ImageView>(R.id.imgVilao)




    }
}