package com.example.monetario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById<TextView>(R.id.txt_result)
        val button = findViewById<Button>(R.id.btn_converter)

        button.setOnClickListener {
            converter()

        }


    }


    private fun converter() {
        val selectedcurrency = findViewById<RadioGroup>(R.id.radio_group)
        val checked = selectedcurrency.checkedRadioButtonId
        val editField = findViewById<EditText>(R.id.edit_field)

        val currency = when (checked) {
            R.id.radio_usd -> "USD"
            R.id.radio_eur -> "EUR"
            R.id.radio_clp -> "CLP"
            else -> print("NOPE")
        }

        val value = editField.text.toString()

        value.let {
            result.text = value
            result.visibility = View.VISIBLE
        }

        Thread(
            //TO DO

        ).start()


    }
}