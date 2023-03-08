package com.example.herosvsuniverse.data

import android.graphics.ColorSpace
import com.example.herosvsuniverse.model.Lutas
import com.example.herosvsuniverse.R

/**
 * [Datasource] generates a list of [Lutas]
 */
class Datasource() {

    fun loadAffirmations(): List<Lutas> {
        return listOf<Lutas>(
            /*Lutas(R.drawable.batmam),
            Lutas(R.drawable.superman),
            Lutas(R.drawable.mulhermaravilha),
            Lutas(R.drawable.flex),
            Lutas(R.drawable.lanternaverde),
            Lutas(R.drawable.aquaman)*/
            Lutas(R.string.descricaoAquamam, R.drawable.aquaman,R.string.descricaoFlex, R.drawable.flex),
            Lutas(R.string.descricaoAquamam, R.drawable.aquaman,R.string.descricaoFlex, R.drawable.flex),

        )
    }
}