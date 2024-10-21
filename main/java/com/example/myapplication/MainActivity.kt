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
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler", "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler", "NZXT Kraken X63 280mm AIO Liquid Cooler", "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler", "DeepCool Assassin III Air Cooler", "Dark Rock Pro 4 Air Cooler", "NH-D15 Chromax Black Air Cooler", "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler", "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler", "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler",
            "MSI MAG B550 Tomahawk (AM4, ATX)", "ASRock B660 Pro RS (LGA 1700, ATX)", "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)", "Gigabyte B650 AORUS Master (AM5, ATX)", "ASRock X670E Taichi (AM5, ATX)", "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)", "MSI MEG X670E ACE (AM5, ATX)", "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)", "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)", "ASUS ROG Crosshair X670E Extreme (AM5, ATX)",
            "NVIDIA GeForce RTX 3060 12GB", "AMD Radeon RX 6700 XT 12GB", "NVIDIA GeForce RTX 3060 Ti 8GB", "AMD Radeon RX 7800 XT 16GB", "NVIDIA GeForce RTX 4070 12GB", "AMD Radeon RX 7900 XT 20GB", "NVIDIA GeForce RTX 4070 Ti 12GB", "AMD Radeon RX 7900 XTX 24GB", "NVIDIA GeForce RTX 4080 16GB", "ASUS ROG Crosshair X670E Extreme (AM5, ATX)",
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600", "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200", "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733", "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600", "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000", "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200", "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600", "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200", "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000", "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600",
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION", "Adata SC750 500GB external SSD 500GB BLACK", "Adata SC750 External SSD 1TB", "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB Solid State Drive", "Seagate Barracuda 2TB HDD", "Crucial MX500 1TB SATA III SSD", "Samsung 870 QVO 2TB SATA III SSD", "Western Digital WD Black SN750 500GB NVMe SSD", "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD", "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD",
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply", "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze", "Corsair CX750 750 watts 80 Plus Bronze Power Supply", "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply", "Thermaltake Smart 500W 80+ White", "Cooler Master MWE Bronze 650W 80+ Bronze", "Corsair RM750x 750W 80+ Gold", "EVGA SuperNOVA 850 G3 850W 80+ Gold", "Seasonic Prime TX-1000 1000W 80+ Titanium", "Corsair AX1600i 1600W 80+ Titanium",
            "Fractal Design Meshify C", "Cooler Master MasterBox TD500 Mesh", "Phanteks Eclipse P600S", "Corsair Crystal Series 680X RGB", "NZXT H510 Elite", "Fractal Design Define 7 XL", "Phanteks Enthoo Elite", "Cooler Master Cosmos C700M", "Corsair Obsidian 1000D", "NZXT H710i",

            )


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
