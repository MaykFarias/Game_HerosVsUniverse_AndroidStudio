package com.example.herosvsuniverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class EscolhaDoHeroiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_do_heroi)

        var imagemPrincipalHeroi = findViewById<ImageView>(R.id.imagemHeroiPrincipal)
        var descricaoPrincialHeroi = findViewById<TextView>(R.id.descricaoHeroiPrincipal)
        var selecionado = false


        val btnEscolhaHeroi = findViewById<Button>(R.id.btnEscolhaHeroi)
        btnEscolhaHeroi.setOnClickListener {
            if (selecionado == true) {
                val intent = Intent(this, EscolhaDoVilaoActivity::class.java)
                startActivity(intent)

            }
        }
        val simboloSuperman = findViewById<ImageView>(R.id.simbolosuperman)
        simboloSuperman.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.superman)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descricaoSupermam)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
        val simboloBatmam = findViewById<ImageView>(R.id.simbolobatmam)
        simboloBatmam.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.batmam)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descricaoBatmam)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
        val simboloMulhervaravilha = findViewById<ImageView>(R.id.simbolomulhermaravillha)
        simboloMulhervaravilha.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.mulhermaravilha)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descicaoMulherMaravilha)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
        val simboloFlex = findViewById<ImageView>(R.id.simboloflex)
        simboloFlex.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.flex)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descricaoFlex)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
        val simboloLanternaVerde = findViewById<ImageView>(R.id.simbololanternaverde)
        simboloLanternaVerde.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.lanternaverde)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descricaoLanternaVerde)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
        val simboloAquamam = findViewById<ImageView>(R.id.simboloaquamam)
        simboloAquamam.setOnClickListener {
            imagemPrincipalHeroi.setImageResource(R.drawable.aquaman)
            selecionado = true
            imagemPrincipalHeroi.visibility = View.VISIBLE
            descricaoPrincialHeroi.setText(R.string.descricaoAquamam)
            descricaoPrincialHeroi.visibility = View.VISIBLE
        }
    }
}