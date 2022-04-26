package com.example.relativelayoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val NAME = "com.example.relativelayoutapp.GETNAME"
const val LAST_NAME = "com.example.relativelayoutapp.GETLASTNAME"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.txtVw1)
        val textView2 = findViewById<TextView>(R.id.txtVw2)

        //val editText = findViewById<EditText>(R.id.editText)
        //val editText2 = findViewById<EditText>(R.id.editText2)

        val showButton = findViewById<Button>(R.id.showInput)

    }

    fun sendMessage(view: View) {
        val firstName = findViewById<EditText>(R.id.editText)
        val lastName = findViewById<EditText>(R.id.editText2)

        val getName = firstName.text.toString()
        val getLastName = lastName.text.toString()

        val intentName = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(NAME, getName)
        }
        val intentSurname = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(LAST_NAME, getLastName)
        }
        startActivity(intentName)
        startActivity(intentSurname)
    }
}