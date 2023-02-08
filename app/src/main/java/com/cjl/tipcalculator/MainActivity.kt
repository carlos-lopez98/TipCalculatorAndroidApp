package com.cjl.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val costOfService = findViewById<EditText>(R.id.cost_of_service)
        val calculateButton = findViewById<Button>(R.id.calculate_button)


        calculateButton.setOnClickListener(){

            val inputPrice = costOfService.text

            

            Toast.makeText(this,inputPrice, Toast.LENGTH_SHORT).show()

        }
    }
}