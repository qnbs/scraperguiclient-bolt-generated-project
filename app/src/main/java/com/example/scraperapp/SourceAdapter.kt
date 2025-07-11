package com.example.scraperapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SourceAdapter(private val sources: List<Source>) : RecyclerView.Adapter<SourceAdapter.SourceViewHolder>() {

    class SourceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val sourceName: TextView = view.findViewById(R.id.sourceName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SourceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.source_item, parent, false)
        return SourceViewHolder(view)
    }

    override fun onBindViewHolder(holder: SourceViewHolder, position: Int) {
        val source = sources[position]
        holder.sourceName.text = source.name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, SourceDetailActivity::class.java).apply {
                putExtra("SOURCE_NAME", source.name)
                putExtra("SOURCE_URL", source.url)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = sources.size
}
