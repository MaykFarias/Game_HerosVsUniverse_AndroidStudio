package com.example.herosvsuniverse

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EscolhaDoVilaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_do_vilao)

        var imagemPrincipalVilao = findViewById<ImageView>(R.id.imagemVilaoPrincipal)
        var descricaoPrincipalVilao = findViewById<TextView>(R.id.descricaoVilaoPrincipal)
        var selecionado = false


        val btnEscolhaHeroi = findViewById<Button>(R.id.btnEscolhaVilao)
        btnEscolhaHeroi.setOnClickListener {
            if (selecionado == true) {
                val intent = Intent(this, RoundsActivity::class.java)
                startActivity(intent)
            }
        }


        val simboloCoringa = findViewById<ImageView>(R.id.simbolocoringa)
        simboloCoringa.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.corpocoringa)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoCoringa)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
        val simboloMagneto = findViewById<ImageView>(R.id.simbolomagneto)
        simboloMagneto.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.corpomagneto)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoMagneto)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
        val simboloLexLutor = findViewById<ImageView>(R.id.simbololexlutor)
        simboloLexLutor.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.lexlutor)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoLexLutor)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
        val simbolFlexReversso = findViewById<ImageView>(R.id.simboloflexreversso)
        simbolFlexReversso.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.corpoflexreversso)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoFlexReverso)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
        val simboloVenon = findViewById<ImageView>(R.id.simbolovenon)
        simboloVenon.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.venon)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoVenon)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
        val simboloAquamam = findViewById<ImageView>(R.id.simbolomuhergato)
        simboloAquamam.setOnClickListener {
            imagemPrincipalVilao.setImageResource(R.drawable.corpomulhergato)
            selecionado = true
            imagemPrincipalVilao.visibility = View.VISIBLE
            descricaoPrincipalVilao.setText(R.string.descricaoMulherGato)
            descricaoPrincipalVilao.visibility = View.VISIBLE
        }
    }
}