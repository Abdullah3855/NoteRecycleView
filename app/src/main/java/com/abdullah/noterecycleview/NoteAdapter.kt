package com.abdullah.noterecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val notesList: List<Note>): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val text1: TextView = itemView.findViewById(R.id.note1_text_view)
        val text2: TextView = itemView.findViewById(R.id.note1_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.note_code_item,
            parent, false)
        return NoteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val currentNote = notesList[position]
        holder.imageView.setImageResource(currentNote.imageResource)
        holder.text1.setText(currentNote.note1TextView)
        holder.text2.setText(currentNote.note2TextView)

    }

    override fun getItemCount() = notesList.size
}

