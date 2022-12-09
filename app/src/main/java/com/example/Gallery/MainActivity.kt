package com.example.Gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Gallery.adapter.ItemAdapter
import com.example.Gallery.data.Datasource
import com.example.Gallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        binding.recyclerView.adapter = ItemAdapter(this, myDataset)
        binding.recyclerView.setHasFixedSize(true)
    }
}