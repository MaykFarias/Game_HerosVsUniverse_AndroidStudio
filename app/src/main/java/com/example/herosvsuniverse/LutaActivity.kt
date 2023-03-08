package com.example.herosvsuniverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.herosvsuniverse.adapter.ItemAdapter
import com.example.herosvsuniverse.data.Datasource

class LutaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luta)

        supportActionBar?.hide()

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)


        val btnResultado = findViewById<Button>(R.id.button)
        btnResultado.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }
    }

}