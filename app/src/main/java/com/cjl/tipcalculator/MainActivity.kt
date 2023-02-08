package com.cjl.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val costOfService = findViewById<EditText>(R.id.cost_of_service)
        val calculateButton = findViewById<Button>(R.id.calculate_button)

        val radioButtonAmazing = findViewById<RadioButton>(R.id.option_twenty_percent)
        val radioButtonGreat = findViewById<RadioButton>(R.id.option_fifteen_percent)
        val radioButtonOkay = findViewById<RadioButton>(R.id.option_ten_percent)

        var tipAmountDisplay = findViewById<TextView>(R.id.tip_amount_display)

        calculateButton.setOnClickListener(){

            val inputPrice = Integer.parseInt(costOfService.text.toString())
            var tipAmount: Double = inputPrice.toDouble()

            if(radioButtonAmazing.isChecked){
                tipAmount *= .2
            } else if (radioButtonGreat.isChecked){
                tipAmount *= .15
            }else if (radioButtonOkay.isChecked){
                tipAmount *= .1
            }

            tipAmountDisplay.text = " ${tipAmount.toString()} $"

            Toast.makeText(this,"Total: $inputPrice$ + $tipAmount$ = ${inputPrice + tipAmount}$", Toast.LENGTH_SHORT).show()
        }



    }
}