package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CompareActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compare)

        // Initialize the map of PC parts with descriptions


        //////////////// IMAGE TEXT TITLE ///////////////

        val pcPartsMapTitleImage = mapOf(

                                    ////CPU/////
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "AMD Ryzen 5 7600X", // Replace with actual drawable names
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X",

                                ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Cooler Master Hyper 212",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Corsair H100i RGB PLATINUM 240mm",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "NZXT Kraken X63 280mm",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Cooler Master MasterLiquid ML360R",
            "DeepCool Assassin III Air Cooler" to "DeepCool Assassin III",
            "Dark Rock Pro 4 Air Cooler" to "Dark Rock Pro 4",
            "NH-D15 Chromax Black Air Cooler" to "NH-D15 Chromax Black",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "ASUS ROG RYUJIN II 360 360mm",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Corsair iCUE H150i ELITE CAPELLIX XT 360mm",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "Cooler Master Hyper 212NZXT Kraken Z73 RGB 360mm",

            // Add more parts and their images here as needed

        )



        ///////////// IMAGEEE ////////////

        // Initialize the map of PC parts with images
        val pcPartsMapImage = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to R.drawable.ryzen5_image, // Replace with actual drawable names
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to R.drawable.ryzen_7,
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to R.drawable.ryzen_7,
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to R.drawable.ryzen_7,
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to R.drawable.ryzen_9,
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to R.drawable.ryzen_9,
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to R.drawable.ryzen_9,
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to R.drawable.ryzen_9,
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to R.drawable.ryzen_9,
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to R.drawable.ryzen_9,

            ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to R.drawable.cooler_master212,
            // Add more parts and their images here as needed
        )


        ///////////// RATING ////////////

        val pcPartsMapRating = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "Overall Ratings: 50%",
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "Overall Ratings: 58%",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "Overall Ratings: 77%",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "Overall Ratings: 78%",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "Overall Ratings: 80%",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "Overall Ratings: 82%",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "Overall Ratings: 84%",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "Overall Ratings: 86%",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "Overall Ratings: 88%",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "Overall Ratings: 90%",


            // Add more parts and their details here as needed
        )

        val pcPartsMapFeaturesTitle = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "AMD Ryzen 5 7600X", // Replace with actual drawable names
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X",

            // Add more parts and their images here as needed
        )

        ////////////// FEATURES //////////

        val pcPartsMapFeatures = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "The AMD Ryzen 5 7600X is a powerful mid-range processor designed for multitasking and gaming with 6 cores and 12 threads.",
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X description",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700 description",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D descrip f",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X desc f" ,
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X desc f",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X desc f",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D desc f",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D desc f",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X desc f",

            // Add more parts and their details here as needed
        )

        val pcPartsMapGenInfo = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "AMD Ryzen 5 7600X. description",
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor description",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700 description",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D descr g",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X desc g",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X desc g",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X desc g",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D desc g",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D desc g",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X desc g",


            // Add more parts and their details here as needed
        )

        val pcPartsMapPerformance = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor descr",
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor description",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700 descript",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D desc p",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X desc p",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X desc p",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X desc p",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D desc p",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D desc p",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X desc p",


            // Add more parts and their details here as needed
        )


        // Fetch the data passed from MainActivity
        val partOne = intent.getStringExtra("partOne")
        val partTwo = intent.getStringExtra("partTwo")

        //////////////////// IMAGE TITLE TEXT //////////////
        val partOneImageTitle = findViewById<TextView>(R.id.partOneImageTitle)
        val partTwoImageTitle = findViewById<TextView>(R.id.partTwoImageTitle)

        partOneImageTitle.text = pcPartsMapTitleImage[partOne] ?: "Details not available for $partOne"
        partTwoImageTitle.text = pcPartsMapTitleImage[partTwo] ?: "Details not available for $partTwo"


        //////////////// IMAGE ////////////////////

        val partOneImage = findViewById<ImageView>(R.id.partOneImage)
        val partTwoImage = findViewById<ImageView>(R.id.partTwoImage)


        partOneImage.setImageResource(pcPartsMapImage[partOne] ?: R.drawable.blank_black)
        partTwoImage.setImageResource(pcPartsMapImage[partTwo] ?: R.drawable.blank_black)

        /////////////////// RATING ////////////////

        // Initialize TextViews for displaying parts' descriptions
        val partOneRating = findViewById<TextView>(R.id.partOneRating)
        val partTwoRating = findViewById<TextView>(R.id.partTwoRating)

        // Set the TextViews with the parts' descriptions based on the user's input
        partOneRating.text = pcPartsMapRating[partOne] ?: "Details not available for $partOne"
        partTwoRating.text = pcPartsMapRating[partTwo] ?: "Details not available for $partTwo"


        //////////////// FEATURES TITLE TEXT //////////////

        val partOneFtextTitle = findViewById<TextView>(R.id.partOneFtextTitle)
        val partTwoFtextTitle = findViewById<TextView>(R.id.partTwoFtextTitle)
        val partOneGeneralInfoTitle = findViewById<TextView>(R.id.partOneGeneralInfoTitle)
        val partTwoGeneralInfoTitle = findViewById<TextView>(R.id.partTwoGeneralInfoTitle)
        val partOnePerformanceTitle = findViewById<TextView>(R.id.partOnePerformanceTitle)
        val partTwoPerformanceTitle = findViewById<TextView>(R.id.partTwoPerformanceTitle)



        partOneFtextTitle.text = pcPartsMapFeaturesTitle[partOne] ?: "Details not available for $partOne"
        partTwoFtextTitle.text = pcPartsMapFeaturesTitle[partTwo] ?: "Details not available for $partTwo"
        partOneGeneralInfoTitle.text = pcPartsMapFeaturesTitle[partOne] ?: "Details not available for $partOne"
        partTwoGeneralInfoTitle.text = pcPartsMapFeaturesTitle[partTwo] ?: "Details not available for $partTwo"
        partOnePerformanceTitle.text = pcPartsMapFeaturesTitle[partOne] ?: "Details not available for $partOne"
        partTwoPerformanceTitle.text = pcPartsMapFeaturesTitle[partTwo] ?: "Details not available for $partTwo"

        ///////////////////// FEATURES ////////////

        // Initialize TextViews for displaying parts' descriptions
        val partOneFeatures = findViewById<TextView>(R.id.partOneFeatures)
        val partTwoFeatures = findViewById<TextView>(R.id.partTwoFeatures)

        // Set the TextViews with the parts' descriptions based on the user's input
        partOneFeatures.text = pcPartsMapFeatures[partOne] ?: "Details not available for $partOne"
        partTwoFeatures.text = pcPartsMapFeatures[partTwo] ?: "Details not available for $partTwo"

        //////////////// GENERAL INFORMATION //////////////

        // Initialize TextViews for displaying parts' descriptions

        val partOneGeneralInfo = findViewById<TextView>(R.id.partOneGeneralInfo)
        val parttwoGeneralInfo = findViewById<TextView>(R.id.partTwoGeneralInfo)

        // Set the TextViews with the parts' descriptions based on the user's input
        partOneGeneralInfo.text = pcPartsMapGenInfo[partOne] ?: "Details not available for $partOne"
        parttwoGeneralInfo.text = pcPartsMapGenInfo[partTwo] ?: "Details not available for $partTwo"


        //////////////// PERFORMANCE /////////////

        val partOnePerformance = findViewById<TextView>(R.id.partOnePerformance)
        val parttwoPerformance = findViewById<TextView>(R.id.partTwoPerformance)

        // Set the TextViews with the parts' descriptions based on the user's input
        partOnePerformance.text = pcPartsMapPerformance[partOne] ?: "Details not available for $partOne"
        parttwoPerformance.text = pcPartsMapPerformance[partTwo] ?: "Details not available for $partTwo"




        // Initialize the Back button and set its click listener
        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Ends the current activity and goes back to MainActivity


        }


    }
}
