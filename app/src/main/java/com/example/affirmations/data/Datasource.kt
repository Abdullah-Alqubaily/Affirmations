package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.drawable.s1),
            Affirmation(R.drawable.s2),
            Affirmation(R.drawable.s4),
            Affirmation(R.drawable.s5),
            Affirmation(R.drawable.s6),
            Affirmation(R.drawable.s7),
            Affirmation(R.drawable.s8),
            Affirmation(R.drawable.s9),
            Affirmation(R.drawable.s10),
            Affirmation(R.drawable.image1),
            Affirmation(R.drawable.image2),
            Affirmation(R.drawable.image3),
            Affirmation(R.drawable.image4),
            Affirmation(R.drawable.image5),
            Affirmation(R.drawable.image6),
            Affirmation(R.drawable.image7),
            Affirmation(R.drawable.image8),
            Affirmation(R.drawable.image9),
            Affirmation(R.drawable.image10)
        )
    }
}