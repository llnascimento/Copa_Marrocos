package com.example.marrocos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.marrocos.data.Datasource

class DetailActivity : AppCompatActivity() {

    companion object {
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escalacao)
        val myDataset = Datasource().loadMarrocos()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = EscalacaoAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}