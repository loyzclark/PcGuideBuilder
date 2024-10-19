package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize EditText fields and the Button
        val partOneInput: AutoCompleteTextView = findViewById(R.id.partOneInput)
        val partTwoInput: AutoCompleteTextView = findViewById(R.id.partTwoInput)
        val compareButton = findViewById<Button>(R.id.compareButton)


        // List of parts to suggest
        val parts = arrayOf("AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor", "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor", "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor", "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor", "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor", "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor", "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor", "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor", "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor", "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor",
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler", "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler", "NZXT Kraken X63 280mm AIO Liquid Cooler", "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler", "DeepCool Assassin III Air Cooler", "Dark Rock Pro 4 Air Cooler", "NH-D15 Chromax Black Air Cooler", "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler", "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler", "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler")


        // Create an ArrayAdapter to set the data for the dropdown
        //val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, parts)

        val adapter = ArrayAdapter(this, R.layout.dropdown_item, parts)

        // Set the adapter for the AutoCompleteTextView
        partOneInput.setAdapter(adapter)
        partTwoInput.setAdapter(adapter)

        partOneInput.threshold = 1 // 1 character before suggestions show
        partTwoInput.threshold = 1


        // Set up the onClickListener for the Compare button
        compareButton.setOnClickListener {
            val partOne = partOneInput.text.toString().trim()
            val partTwo = partTwoInput.text.toString().trim()

            if (partOne.isNotEmpty() && partTwo.isNotEmpty()) {
                // Create an Intent to open CompareActivity
                val intent = Intent(this, CompareActivity::class.java)

                // Pass the entered part names (Ryzen 5 and Intel Core i5)

                intent.putExtra("partOne", partOne)
                intent.putExtra("partTwo", partTwo)

                // Start CompareActivity
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill both fields to compare.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
