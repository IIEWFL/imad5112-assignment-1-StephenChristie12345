package com.example.mealsuggestions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

///Defined conponment from varibale to define the xml
        //<> this tells the viewbyid what type to expect
       val dayInputEditText = findViewById<EditText>(R.id.dayInput)
       val suggestionTextView = findViewById<TextView>(R.id.suggestion)

        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnEnter = findViewById<Button>(R.id.btnEnter)



        btnEnter.setOnClickListener()
        {
            val inputText = dayInputEditText.text.toString()
            var outputText: String

            if (inputText == "Morning") {
                outputText = "Eggs on Toast"
            }
            else if (inputText == "Mid-morning") {
                outputText = "Banana"
            }
            else if (inputText == "Afternoon") {
                outputText = "Chicken Mayo Sandwich"
            }
            else if (inputText == "Mid-afternoon") {
                outputText = "Rusk And Tea"
            }
            else if (inputText == "Dinner") {
                outputText = "Roast Lamb and Potatoes"
            }
            else if (inputText == "Dessert") {
                outputText = "Cake"
            }
            else {
                outputText = "Invalid Time Of Day, Please Input (Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, Dessert)"

            }

            suggestionTextView.text = outputText

        }

        btnReset.setOnClickListener()
        {
            suggestionTextView.text = ""
            dayInputEditText.text.clear()
        }


        }
    }
