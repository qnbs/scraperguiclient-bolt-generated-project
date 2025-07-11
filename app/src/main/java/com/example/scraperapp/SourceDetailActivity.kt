package com.example.scraperapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.content.Intent
import android.net.Uri

class SourceDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_source_detail)

        val sourceName = intent.getStringExtra("SOURCE_NAME")
        val sourceUrl = intent.getStringExtra("SOURCE_URL")

        findViewById<TextView>(R.id.sourceName).text = sourceName
        findViewById<TextView>(R.id.sourceUrl).text = sourceUrl

        findViewById<Button>(R.id.openUrlButton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(sourceUrl))
            startActivity(intent)
        }
    }
}
