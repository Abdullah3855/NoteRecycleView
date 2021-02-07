package com.abdullah.noterecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notesList = ArrayList<Note>()
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))
        notesList.add(Note(R.drawable.ic_green, "note 1", "note 1 details"))

        notes_Recycler_View.adapter = NoteAdapter(notesList)
        notes_Recycler_View.
    }
}