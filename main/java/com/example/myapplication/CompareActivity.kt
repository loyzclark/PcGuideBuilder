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
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "NZXT Kraken Z73 RGB 360mm",

                                ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "MSI MAG B550 Tomahawk",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "ASRock B660 Pro RS",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "ASUS TUF Gaming X670E-Plus WiFi",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Gigabyte B650 AORUS Master",
            "ASRock X670E Taichi (AM5, ATX)" to "ASRock X670E Taichi",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "ASUS ROG Strix Z790-E Gaming WiFi",
            "MSI MEG X670E ACE (AM5, ATX)" to "MSI MEG X670E ACE",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Gigabyte Z790 AORUS XTREME",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "MSI MEG Z790 GODLIKE",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "ASUS ROG Crosshair X670E Extreme",

                    ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "NVIDIA GeForce RTX 3060 12GB",
            "AMD Radeon RX 6700 XT 12GB" to "AMD Radeon RX 6700 XT 12GB",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "NVIDIA GeForce RTX 3060 Ti 8GB",
            "AMD Radeon RX 7800 XT 16GB" to "AMD Radeon RX 7800 XT 16GB",
            "NVIDIA GeForce RTX 4070 12GB" to "NVIDIA GeForce RTX 4070 12GB",
            "AMD Radeon RX 7900 XT 20GB" to "AMD Radeon RX 7900 XT 20GB",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "NVIDIA GeForce RTX 4070 Ti 12GB",
            "AMD Radeon RX 7900 XTX 24GB" to "AMD Radeon RX 7900 XTX 24GB",
            "NVIDIA GeForce RTX 4080 16GB" to "NVIDIA GeForce RTX 4080 16GB",
            "NVIDIA GeForce RTX 4090 24GB" to "NVIDIA GeForce RTX 4090 24GB",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Thermaltake TOUGHRAM RGB 32GB",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "ADATA XPG Spectrix D60G 16GB",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Patriot Viper Steel 16GB",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Kingston FURY Beast 32GB",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Team T-FORCE Vulcan Z 8GB",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to "Crucial Ballistix 16GB",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "G.Skill Ripjaws V 16GB",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Corsair Vengeance LPX 32GB",
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "G.Skill Trident Z Royal 64GB",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Corsair Dominator Platinum RGB 32GB",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Adata SC750 500GB external SSD 500GB BLACK",
            "Adata SC750 External SSD 1TB" to "Adata SC750 External SSD 1TB",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD",
            "Seagate Barracuda 2TB HDD" to "Seagate Barracuda 2TB HDD",
            "Crucial MX500 1TB SATA III SSD" to "Crucial MX500 1TB SATA III SSD",
            "Samsung 870 QVO 2TB SATA III SSD" to "Samsung 870 QVO 2TB SATA III SSD",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Western Digital WD Black SN750 500GB NVMe SSD",
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD",

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to " Gigabyte P450B 450 watts 80 Plus Bronze Power Supply",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Corsair CX750 750 watts 80 Plus Bronze Power Supply",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply",
            "Thermaltake Smart 500W 80+ White" to "Thermaltake Smart 500W 80+ White",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Cooler Master MWE Bronze 650W 80+ Bronze",
            "Corsair RM750x 750W 80+ Gold" to "Corsair RM750x 750W 80+ Gold",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "EVGA SuperNOVA 850 G3 850W 80+ Gold" ,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Seasonic Prime TX-1000 1000W 80+ Titanium",
            "Corsair AX1600i 1600W 80+ Titanium" to "Corsair AX1600i 1600W 80+ Titanium",

            ///////SUPPLY  ////////
            "Fractal Design Meshify C" to " Fractal Design Meshify C",
            "Cooler Master MasterBox TD500 Mesh" to " Cooler Master MasterBox TD500 Mesh ",
            "Phanteks Eclipse P600S" to "Phanteks Eclipse P600S",
            "Corsair Crystal Series 680X RGB" to "Corsair Crystal Series 680X RGB",
            "NZXT H510 Elite" to "NZXT H510 Elite",
            "Fractal Design Define 7 XL" to "Fractal Design Define 7 XL",
            "Phanteks Enthoo Elite" to "Phanteks Enthoo Elite",
            "Cooler Master Cosmos C700M" to "Cooler Master Cosmos C700M" ,
            "Corsair Obsidian 1000D" to "Corsair Obsidian 1000D",
            "NZXT H710i" to "NZXT H710i",
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
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to R.drawable.cooler_212,
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to R.drawable.corsair_h100i,
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to R.drawable.corsair_h100i,
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to R.drawable.corsair_h100i,
            "DeepCool Assassin III Air Cooler" to R.drawable.corsair_h100i,
            "Dark Rock Pro 4 Air Cooler" to R.drawable.corsair_h100i,
            "NH-D15 Chromax Black Air Cooler" to R.drawable.corsair_h100i,
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to R.drawable.corsair_h100i,
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to R.drawable.corsair_h100i,
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to R.drawable.corsair_h100i,

                    ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to R.drawable.msi_mag,
            "ASRock B660 Pro RS (LGA 1700, ATX)" to R.drawable.msi_mag,
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to R.drawable.msi_mag,
            "Gigabyte B650 AORUS Master (AM5, ATX)" to R.drawable.msi_mag,
            "ASRock X670E Taichi (AM5, ATX)" to R.drawable.msi_mag,
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to R.drawable.msi_mag,
            "MSI MEG X670E ACE (AM5, ATX)" to R.drawable.msi_mag,
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to R.drawable.msi_mag,
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to R.drawable.msi_mag,
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to R.drawable.msi_mag,

            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to R.drawable.nvidia_3060_12gb,
            "AMD Radeon RX 6700 XT 12GB" to R.drawable.nvidia_3060_12gb,
            "NVIDIA GeForce RTX 3060 Ti 8GB" to R.drawable.nvidia_3060_12gb,
            "AMD Radeon RX 7800 XT 16GB" to R.drawable.nvidia_3060_12gb,
            "NVIDIA GeForce RTX 4070 12GB" to R.drawable.nvidia_3060_12gb,
            "AMD Radeon RX 7900 XT 20GB" to R.drawable.nvidia_3060_12gb,
            "NVIDIA GeForce RTX 4070 Ti 12GB" to R.drawable.nvidia_3060_12gb,
            "AMD Radeon RX 7900 XTX 24GB" to R.drawable.nvidia_3060_12gb,
            "NVIDIA GeForce RTX 4080 16GB" to R.drawable.nvidia_3060_12gb,
            "NVIDIA GeForce RTX 4090 24GB" to R.drawable.nvidia_3060_12gb,

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to R.drawable.adata_500gb,
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to R.drawable.adata_500gb,
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to R.drawable.adata_500gb,
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to R.drawable.adata_500gb,
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to R.drawable.adata_500gb,
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to R.drawable.adata_500gb,
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to R.drawable.adata_500gb,
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to R.drawable.adata_500gb,
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to R.drawable.adata_500gb,
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to R.drawable.adata_500gb,

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to R.drawable.seagate_skyhawk,
            "Adata SC750 500GB external SSD 500GB BLACK" to R.drawable.seagate_skyhawk,
            "Adata SC750 External SSD 1TB" to R.drawable.seagate_skyhawk,
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to R.drawable.seagate_skyhawk,
            "Seagate Barracuda 2TB HDD" to R.drawable.seagate_skyhawk,
            "Crucial MX500 1TB SATA III SSD" to R.drawable.seagate_skyhawk,
            "Samsung 870 QVO 2TB SATA III SSD" to R.drawable.seagate_skyhawk,
            "Western Digital WD Black SN750 500GB NVMe SSD" to R.drawable.seagate_skyhawk,
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to R.drawable.seagate_skyhawk,
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to R.drawable.seagate_skyhawk,

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to R.drawable.gigabyte_p450b,
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to R.drawable.gigabyte_p450b,
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to R.drawable.gigabyte_p450b,
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to R.drawable.gigabyte_p450b,
            "Thermaltake Smart 500W 80+ White" to R.drawable.gigabyte_p450b,
            "Cooler Master MWE Bronze 650W 80+ Bronze" to R.drawable.gigabyte_p450b,
            "Corsair RM750x 750W 80+ Gold" to R.drawable.gigabyte_p450b,
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to R.drawable.gigabyte_p450b,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to R.drawable.gigabyte_p450b,
            "Corsair AX1600i 1600W 80+ Titanium" to R.drawable.gigabyte_p450b,

            ///////CASE  ////////
            "Fractal Design Meshify C" to R.drawable.case_meshify,
            "Cooler Master MasterBox TD500 Mesh" to R.drawable.case_meshify,
            "Phanteks Eclipse P600S" to R.drawable.case_meshify,
            "Corsair Crystal Series 680X RGB" to R.drawable.case_meshify,
            "NZXT H510 Elite" to R.drawable.case_meshify,
            "Fractal Design Define 7 XL" to R.drawable.case_meshify,
            "Phanteks Enthoo Elite" to R.drawable.case_meshify,
            "Cooler Master Cosmos C700M" to R.drawable.case_meshify,
            "Corsair Obsidian 1000D" to R.drawable.case_meshify,
            "NZXT H710i" to R.drawable.case_meshify,
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

            ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Overall Ratings: 90%",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Overall Ratings: 90%",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "Overall Ratings: 90%",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Overall Ratings: 90%",
            "DeepCool Assassin III Air Cooler" to "Overall Ratings: 90%",
            "Dark Rock Pro 4 Air Cooler" to "Overall Ratings: 90%",
            "NH-D15 Chromax Black Air Cooler" to "Overall Ratings: 90%",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "Overall Ratings: 90%",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Overall Ratings: 90%",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "Overall Ratings: 90%",

            ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "Overall Ratings: 90%",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "Overall Ratings: 90%",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "Overall Ratings: 90%",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Overall Ratings: 90%",
            "ASRock X670E Taichi (AM5, ATX)" to "Overall Ratings: 90%",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "Overall Ratings: 90%",
            "MSI MEG X670E ACE (AM5, ATX)" to "Overall Ratings: 90%",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Overall Ratings: 90%",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "Overall Ratings: 90%",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "Overall Ratings: 90%",

            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "Overall Ratings: 90%",
            "AMD Radeon RX 6700 XT 12GB" to "Overall Ratings: 90%",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "Overall Ratings: 90%",
            "AMD Radeon RX 7800 XT 16GB" to "Overall Ratings: 90%",
            "NVIDIA GeForce RTX 4070 12GB" to "Overall Ratings: 90%",
            "AMD Radeon RX 7900 XT 20GB" to "Overall Ratings: 90%",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "Overall Ratings: 90%",
            "AMD Radeon RX 7900 XTX 24GB" to "Overall Ratings: 90%",
            "NVIDIA GeForce RTX 4080 16GB" to "Overall Ratings: 90%",
            "NVIDIA GeForce RTX 4090 24GB" to "Overall Ratings: 90%",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Overall Ratings: 90%",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "Overall Ratings: 90%",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Overall Ratings: 90%",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Overall Ratings: 90%",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Overall Ratings: 90%",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-320q" to "Overall Ratings: 90%",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "Overall Ratings: 90%",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Overall Ratings: 90%",
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "Overall Ratings: 90%",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Overall Ratings: 90%",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Overall Ratings: 90%",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Overall Ratings: 90%",
            "Adata SC750 External SSD 1TB" to "Overall Ratings: 90%",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Overall Ratings: 90%",
            "Seagate Barracuda 2TB HDD" to "Overall Ratings: 90%",
            "Crucial MX500 1TB SATA III SSD" to "Overall Ratings: 90%",
            "Samsung 870 QVO 2TB SATA III SSD" to "Overall Ratings: 90%",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Overall Ratings: 90%",
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Overall Ratings: 90%",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Overall Ratings: 90%",
            // Add more parts and their images here as needed

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to "Overall Ratings: 90%",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "Overall Ratings: 90%",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Overall Ratings: 90%",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "Overall Ratings: 90%",
            "Thermaltake Smart 500W 80+ White" to "Overall Ratings: 90%",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Overall Ratings: 90%",
            "Corsair RM750x 750W 80+ Gold" to "Overall Ratings: 90%",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "Overall Ratings: 90%",
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Overall Ratings: 90%",
            "Corsair AX1600i 1600W 80+ Titanium" to "Overall Ratings: 90%",

            ///////CASE  ////////
            "Fractal Design Meshify C" to "Overall Ratings: 90%",
            "Cooler Master MasterBox TD500 Mesh" to "Overall Ratings: 90%",
            "Phanteks Eclipse P600S" to "Overall Ratings: 90%",
            "Corsair Crystal Series 680X RGB" to "Overall Ratings: 90%",
            "NZXT H510 Elite" to "Overall Ratings: 90%",
            "Fractal Design Define 7 XL" to "Overall Ratings: 90%",
            "Phanteks Enthoo Elite" to "Overall Ratings: 90%",
            "Cooler Master Cosmos C700M" to "Overall Ratings: 90%",
            "Corsair Obsidian 1000D" to "Overall Ratings: 90%",
            "NZXT H710i" to "Overall Ratings: 90%",

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

                            ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Cooler Master Hyper 212",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Corsair H100i RGB PLATINUM 240mm",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "NZXT Kraken X63 280mm",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Cooler Master MasterLiquid ML360R",
            "DeepCool Assassin III Air Cooler" to "DeepCool Assassin III",
            "Dark Rock Pro 4 Air Cooler" to "Dark Rock Pro 4",
            "NH-D15 Chromax Black Air Cooler" to "NH-D15 Chromax Black",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "ASUS ROG RYUJIN II 360 360mm",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Corsair iCUE H150i ELITE CAPELLIX",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "NZXT Kraken Z73 RGB 360mm",

            ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "MSI MAG B550 Tomahawk",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "ASRock B660 Pro RS",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "ASUS TUF Gaming X670E-Plus WiFi",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Gigabyte B650 AORUS Master",
            "ASRock X670E Taichi (AM5, ATX)" to "ASRock X670E Taichi",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "ASUS ROG Strix Z790-E Gaming WiFi",
            "MSI MEG X670E ACE (AM5, ATX)" to "MSI MEG X670E ACE",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Gigabyte Z790 AORUS XTREME",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "MSI MEG Z790 GODLIKE",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "ASUS ROG Crosshair X670E Extreme",

            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "NVIDIA GeForce RTX 3060 12GB",
            "AMD Radeon RX 6700 XT 12GB" to "AMD Radeon RX 6700 XT 12GB",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "NVIDIA GeForce RTX 3060 Ti 8GB",
            "AMD Radeon RX 7800 XT 16GB" to "AMD Radeon RX 7800 XT 16GB",
            "NVIDIA GeForce RTX 4070 12GB" to "NVIDIA GeForce RTX 4070 12GB",
            "AMD Radeon RX 7900 XT 20GB" to "AMD Radeon RX 7900 XT 20GB",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "NVIDIA GeForce RTX 4070 Ti 12GB",
            "AMD Radeon RX 7900 XTX 24GB" to "AMD Radeon RX 7900 XTX 24GB",
            "NVIDIA GeForce RTX 4080 16GB" to "NVIDIA GeForce RTX 4080 16GB",
            "NVIDIA GeForce RTX 4090 24GB" to "NVIDIA GeForce RTX 4090 24GB",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Thermaltake TOUGHRAM RGB 32GB",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "ADATA XPG Spectrix D60G 16GB",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Patriot Viper Steel 16GB",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Kingston FURY Beast 32GB",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Team T-FORCE Vulcan Z 8GB",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to "Crucial Ballistix 16GB",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "G.Skill Ripjaws V 16GB",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Corsair Vengeance LPX 32GB",
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "G.Skill Trident Z Royal 64GB",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Corsair Dominator Platinum RGB 32GB",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Adata SC750 500GB external SSD 500GB BLACK",
            "Adata SC750 External SSD 1TB" to "Adata SC750 External SSD 1TB",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD",
            "Seagate Barracuda 2TB HDD" to "Seagate Barracuda 2TB HDD",
            "Crucial MX500 1TB SATA III SSD" to "Crucial MX500 1TB SATA III SSD",
            "Samsung 870 QVO 2TB SATA III SSD" to "Samsung 870 QVO 2TB SATA III SSD",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Western Digital WD Black SN750 500GB NVMe SSD",
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD",

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to " Gigabyte P450B 450 watts ",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "MSI MAG A650BN 650Watts/ A550BN 550Watts",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Corsair CX750 750 watts 80 Plus Bronze Power Supply",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "MSI MPG A1000G 1000W ",
            "Thermaltake Smart 500W 80+ White" to "Thermaltake Smart 500W ",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Cooler Master MWE Bronze 650W ",
            "Corsair RM750x 750W 80+ Gold" to "Corsair RM750x 750W ",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "EVGA SuperNOVA 850 G3 850W" ,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Seasonic Prime TX-1000 1000W ",
            "Corsair AX1600i 1600W 80+ Titanium" to "Corsair AX1600i 1600W ",

            ///////CASE  ////////
            "Fractal Design Meshify C" to " Fractal Design Meshify C",
            "Cooler Master MasterBox TD500 Mesh" to " Cooler Master MasterBox TD500 Mesh ",
            "Phanteks Eclipse P600S" to "Phanteks Eclipse P600S",
            "Corsair Crystal Series 680X RGB" to "Corsair Crystal Series 680X RGB",
            "NZXT H510 Elite" to "NZXT H510 Elite",
            "Fractal Design Define 7 XL" to "Fractal Design Define 7 XL",
            "Phanteks Enthoo Elite" to "Phanteks Enthoo Elite",
            "Cooler Master Cosmos C700M" to "Cooler Master Cosmos C700M" ,
            "Corsair Obsidian 1000D" to "Corsair Obsidian 1000D",
            "NZXT H710i" to "NZXT H710i",


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

                                ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Cooler Master Hyper 212 desc f",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Corsair H100i RGB PLATINUM 240mm desc f",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "NZXT Kraken X63 280mm desc f",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Cooler Master MasterLiquid ML360R desc f",
            "DeepCool Assassin III Air Cooler" to "DeepCool Assassin III desc f",
            "Dark Rock Pro 4 Air Cooler" to "Dark Rock Pro 4 desc f",
            "NH-D15 Chromax Black Air Cooler" to "NH-D15 Chromax Black desc f",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "ASUS ROG RYUJIN II 360 360mm desc f",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Corsair iCUE H150i ELITE CAPELLIX XT 360mm dsec f",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "NZXT Kraken Z73 RGB 360mm desc f",

            ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "MSI MAG B550 Tomahawk desc f",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "ASRock B660 Pro RS desc f",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "ASUS TUF Gaming X670E-Plus WiFi desc f",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Gigabyte B650 AORUS Master desc f",
            "ASRock X670E Taichi (AM5, ATX)" to "ASRock X670E Taichi desc f",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "ASUS ROG Strix Z790-E Gaming WiFi desc f",
            "MSI MEG X670E ACE (AM5, ATX)" to "MSI MEG X670E ACE desc f",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Gigabyte Z790 AORUS XTREME desc f",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "MSI MEG Z790 GODLIKE desc f",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "ASUS ROG Crosshair X670E Extreme desc f",

            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "NVIDIA GeForce RTX 3060 12GB desc f",
            "AMD Radeon RX 6700 XT 12GB" to "AMD Radeon RX 6700 XT 12GB desc f",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "NVIDIA GeForce RTX 3060 Ti 8GB desc f",
            "AMD Radeon RX 7800 XT 16GB" to "AMD Radeon RX 7800 XT 16GB desc f",
            "NVIDIA GeForce RTX 4070 12GB" to "NVIDIA GeForce RTX 4070 12GB desc f",
            "AMD Radeon RX 7900 XT 20GB" to "AMD Radeon RX 7900 XT 20GB desc f",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "NVIDIA GeForce RTX 4070 Ti 12GB desc f",
            "AMD Radeon RX 7900 XTX 24GB" to "AMD Radeon RX 7900 XTX 24GB desc f",
            "NVIDIA GeForce RTX 4080 16GB" to "NVIDIA GeForce RTX 4080 16GB desc f",
            "NVIDIA GeForce RTX 4090 24GB" to "NVIDIA GeForce RTX 4090 24GB desc f",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Thermaltake TOUGHRAM RGB 32GB desc f",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "ADATA XPG Spectrix D60G 16GB desc f",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Patriot Viper Steel 16GB desc f",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Kingston FURY Beast 32GB desc f",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Team T-FORCE Vulcan Z 8GB desc f",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to "Crucial Ballistix 16GB desc f",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "G.Skill Ripjaws V 16GB desc f",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Corsair Vengeance LPX 32GB desc f" ,
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "G.Skill Trident Z Royal 64GB desc f",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Corsair Dominator Platinum RGB 32GB desc f",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION desc f",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Adata SC750 500GB external SSD 500GB BLACK desc f",
            "Adata SC750 External SSD 1TB" to "Adata SC750 External SSD 1TB desc f",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD desc f",
            "Seagate Barracuda 2TB HDD" to "Seagate Barracuda 2TB HDD desc f",
            "Crucial MX500 1TB SATA III SSD" to "Crucial MX500 1TB SATA III SSD desc f",
            "Samsung 870 QVO 2TB SATA III SSD" to "Samsung 870 QVO 2TB SATA III SSD desc f",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Western Digital WD Black SN750 500GB NVMe SSD desc f" ,
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD desc f",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD desc f",

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to " Gigabyte P450B 450 watts desc f",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "MSI MAG A650BN 650Watts/ A550BN 550Watts desc f",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Corsair CX750 750 watts 80 Plus Bronze Power Supply desc f",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "MSI MPG A1000G 1000W desc f",
            "Thermaltake Smart 500W 80+ White" to "Thermaltake Smart 500W desc f",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Cooler Master MWE Bronze 650W desc f",
            "Corsair RM750x 750W 80+ Gold" to "Corsair RM750x 750W desc f",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "EVGA SuperNOVA 850 G3 850W desc f" ,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Seasonic Prime TX-1000 1000W desc f",
            "Corsair AX1600i 1600W 80+ Titanium" to "Corsair AX1600i 1600W desc f",

            ///////CASE  ////////
            "Fractal Design Meshify C" to " Fractal Design Meshify C desc f",
            "Cooler Master MasterBox TD500 Mesh" to " Cooler Master MasterBox TD500 Mesh desc f",
            "Phanteks Eclipse P600S" to "Phanteks Eclipse P600S desc f",
            "Corsair Crystal Series 680X RGB" to "Corsair Crystal Series 680X RGB desc f",
            "NZXT H510 Elite" to "NZXT H510 Elite desc f",
            "Fractal Design Define 7 XL" to "Fractal Design Define 7 XL desc f",
            "Phanteks Enthoo Elite" to "Phanteks Enthoo Elite desc f",
            "Cooler Master Cosmos C700M" to "Cooler Master Cosmos C700M desc f" ,
            "Corsair Obsidian 1000D" to "Corsair Obsidian 1000D desc f",
            "NZXT H710i" to "NZXT H710i desc f",
            // Add more parts and their details here as needed
        )

        val pcPartsMapGenInfo = mapOf(
            "AMD Ryzen 5 7600X 4.7 GHz 6-Core Processor" to "AMD Ryzen 5 7600X. description ",
            "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor" to "AMD Ryzen 7 5800X 3.8 GHz 8-Core Processor description",
            "AMD Ryzen 7 7700 3.6 GHz 8-Core Processor" to "AMD Ryzen 7 7700 description",
            "AMD Ryzen 7 7800X3D 4.2 GHz 8-Core Processor" to "AMD Ryzen 7 7800X3D descr g",
            "AMD Ryzen 9 5950X 3.4 GHz 16-Core Processor" to "AMD Ryzen 9 5950X desc g",
            "AMD Ryzen 9 3950X 3.5 GHz 16-Core Processor" to "AMD Ryzen 9 3950X desc g",
            "AMD Ryzen 9 7950X 4.5 GHz 16-Core Processor" to "AMD Ryzen 9 7950X desc g",
            "AMD Ryzen 9 7900X3D 4.4 GHz 12-Core Processor" to "AMD Ryzen 9 7900X3D desc g",
            "AMD Ryzen 9 7950X3D 4.2 GHz 16-Core Processor" to "AMD Ryzen 9 7950X3D desc g",
            "AMD Ryzen 9 9950X 4.3 GHz 16-Core Processor" to "AMD Ryzen 9 9950X desc g",

                                ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Cooler Master Hyper 212 desc g",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Corsair H100i RGB PLATINUM 240mm desc g",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "NZXT Kraken X63 280mm desc g",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Cooler Master MasterLiquid ML360R desc g",
            "DeepCool Assassin III Air Cooler" to "DeepCool Assassin III desc g",
            "Dark Rock Pro 4 Air Cooler" to "Dark Rock Pro 4 desc g",
            "NH-D15 Chromax Black Air Cooler" to "NH-D15 Chromax Black desc g",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "ASUS ROG RYUJIN II 360 360mm desc g",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Corsair iCUE H150i ELITE CAPELLIX XT 360mm dsec g",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "NZXT Kraken Z73 RGB 360mm desc g",

            ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "MSI MAG B550 Tomahawk desc g",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "ASRock B660 Pro RS desc g",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "ASUS TUF Gaming X670E-Plus WiFi desc g",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Gigabyte B650 AORUS Master desc g",
            "ASRock X670E Taichi (AM5, ATX)" to "ASRock X670E Taichi desc g",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "ASUS ROG Strix Z790-E Gaming WiFi desc g",
            "MSI MEG X670E ACE (AM5, ATX)" to "MSI MEG X670E ACE desc g",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Gigabyte Z790 AORUS XTREME desc g",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "MSI MEG Z790 GODLIKE desc g",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "ASUS ROG Crosshair X670E Extreme desc g",

            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "NVIDIA GeForce RTX 3060 12GB desc g",
            "AMD Radeon RX 6700 XT 12GB" to "AMD Radeon RX 6700 XT 12GB desc g",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "NVIDIA GeForce RTX 3060 Ti 8GB desc g",
            "AMD Radeon RX 7800 XT 16GB" to "AMD Radeon RX 7800 XT 16GB desc g",
            "NVIDIA GeForce RTX 4070 12GB" to "NVIDIA GeForce RTX 4070 12GB desc g",
            "AMD Radeon RX 7900 XT 20GB" to "AMD Radeon RX 7900 XT 20GB desc g",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "NVIDIA GeForce RTX 4070 Ti 12GB desc g",
            "AMD Radeon RX 7900 XTX 24GB" to "AMD Radeon RX 7900 XTX 24GB desc g",
            "NVIDIA GeForce RTX 4080 16GB" to "NVIDIA GeForce RTX 4080 16GB desc g",
            "NVIDIA GeForce RTX 4090 24GB" to "NVIDIA GeForce RTX 4090 24GB desc g",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Thermaltake TOUGHRAM RGB 32GB desc g",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "ADATA XPG Spectrix D60G 16GB desc g",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Patriot Viper Steel 16GB desc g",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Kingston FURY Beast 32GB desc g",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Team T-FORCE Vulcan Z 8GB desc g",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to "Crucial Ballistix 16GB desc g",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "G.Skill Ripjaws V 16GB desc g",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Corsair Vengeance LPX 32GB desc g" ,
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "G.Skill Trident Z Royal 64GB desc g",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Corsair Dominator Platinum RGB 32GB desc g",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION desc g",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Adata SC750 500GB external SSD 500GB BLACK desc g",
            "Adata SC750 External SSD 1TB" to "Adata SC750 External SSD 1TB desc g",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD desc g",
            "Seagate Barracuda 2TB HDD" to "Seagate Barracuda 2TB HDD desc g",
            "Crucial MX500 1TB SATA III SSD" to "Crucial MX500 1TB SATA III SSD desc g",
            "Samsung 870 QVO 2TB SATA III SSD" to "Samsung 870 QVO 2TB SATA III SSD desc g",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Western Digital WD Black SN750 500GB NVMe SSD desc g" ,
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD desc g",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD desc g",

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to " Gigabyte P450B 450 watts desc g",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "MSI MAG A650BN 650Watts/ A550BN 550Watts desc g",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Corsair CX750 750 watts 80 Plus Bronze Power Supply desc g",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "MSI MPG A1000G 1000W desc g",
            "Thermaltake Smart 500W 80+ White" to "Thermaltake Smart 500W desc g",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Cooler Master MWE Bronze 650W desc g",
            "Corsair RM750x 750W 80+ Gold" to "Corsair RM750x 750W desc g",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "EVGA SuperNOVA 850 G3 850W desc g" ,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Seasonic Prime TX-1000 1000W desc g",
            "Corsair AX1600i 1600W 80+ Titanium" to "Corsair AX1600i 1600W desc g",

            ///////CASE  ////////
            "Fractal Design Meshify C" to " Fractal Design Meshify C desc g",
            "Cooler Master MasterBox TD500 Mesh" to " Cooler Master MasterBox TD500 Mesh desc g",
            "Phanteks Eclipse P600S" to "Phanteks Eclipse P600S desc g",
            "Corsair Crystal Series 680X RGB" to "Corsair Crystal Series 680X RGB desc g",
            "NZXT H510 Elite" to "NZXT H510 Elite desc g",
            "Fractal Design Define 7 XL" to "Fractal Design Define 7 XL desc g",
            "Phanteks Enthoo Elite" to "Phanteks Enthoo Elite desc g",
            "Cooler Master Cosmos C700M" to "Cooler Master Cosmos C700M desc g" ,
            "Corsair Obsidian 1000D" to "Corsair Obsidian 1000D desc g",
            "NZXT H710i" to "NZXT H710i desc g",
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

                        ///////COOLER////////
            "Cooler Master Hyper 212 RGB Black Edition Air Cooler" to "Cooler Master Hyper 212 desc p",
            "Corsair H100i RGB PLATINUM 240mm AIO Liquid Cooler" to "Corsair H100i RGB PLATINUM 240mm desc p",
            "NZXT Kraken X63 280mm AIO Liquid Cooler" to "NZXT Kraken X63 280mm desc p",
            "Cooler Master MasterLiquid ML360R RGB AIO Liquid Cooler" to "Cooler Master MasterLiquid ML360R desc p",
            "DeepCool Assassin III Air Cooler" to "DeepCool Assassin III desc p",
            "Dark Rock Pro 4 Air Cooler" to "Dark Rock Pro 4 desc p",
            "NH-D15 Chromax Black Air Cooler" to "NH-D15 Chromax Black desc p",
            "ASUS ROG RYUJIN II 360 360mm AIO Liquid Cooler" to "ASUS ROG RYUJIN II 360 360mm desc p",
            "Corsair iCUE H150i ELITE CAPELLIX XT 360mm AIO Liquid Cooler" to "Corsair iCUE H150i ELITE CAPELLIX XT 360mm dsec p",
            "NZXT Kraken Z73 RGB 360mm AIO Liquid Cooler" to "NZXT Kraken Z73 RGB 360mm desc p",

            ///////MOTHERBOARD////////
            "MSI MAG B550 Tomahawk (AM4, ATX)" to "MSI MAG B550 Tomahawk desc p",
            "ASRock B660 Pro RS (LGA 1700, ATX)" to "ASRock B660 Pro RS desc p",
            "ASUS TUF Gaming X670E-Plus WiFi (AM5, ATX)" to "ASUS TUF Gaming X670E-Plus WiFi desc p",
            "Gigabyte B650 AORUS Master (AM5, ATX)" to "Gigabyte B650 AORUS Master desc p",
            "ASRock X670E Taichi (AM5, ATX)" to "ASRock X670E Taichi desc p",
            "ASUS ROG Strix Z790-E Gaming WiFi (LGA 1700, ATX)" to "ASUS ROG Strix Z790-E Gaming WiFi desc p",
            "MSI MEG X670E ACE (AM5, ATX)" to "MSI MEG X670E ACE desc p",
            "Gigabyte Z790 AORUS XTREME (LGA 1700, E-ATX)" to "Gigabyte Z790 AORUS XTREME desc p",
            "MSI MEG Z790 GODLIKE (LGA 1700, E-ATX)" to "MSI MEG Z790 GODLIKE desc p",
            "ASUS ROG Crosshair X670E Extreme (AM5, ATX)" to "ASUS ROG Crosshair X670E Extreme desc p",
            ///////GPU////////
            "NVIDIA GeForce RTX 3060 12GB" to "NVIDIA GeForce RTX 3060 12GB desc p",
            "AMD Radeon RX 6700 XT 12GB" to "AMD Radeon RX 6700 XT 12GB desc p",
            "NVIDIA GeForce RTX 3060 Ti 8GB" to "NVIDIA GeForce RTX 3060 Ti 8GB desc p",
            "AMD Radeon RX 7800 XT 16GB" to "AMD Radeon RX 7800 XT 16GB desc p",
            "NVIDIA GeForce RTX 4070 12GB" to "NVIDIA GeForce RTX 4070 12GB desc p",
            "AMD Radeon RX 7900 XT 20GB" to "AMD Radeon RX 7900 XT 20GB desc p",
            "NVIDIA GeForce RTX 4070 Ti 12GB" to "NVIDIA GeForce RTX 4070 Ti 12GB desc p",
            "AMD Radeon RX 7900 XTX 24GB" to "AMD Radeon RX 7900 XTX 24GB desc p",
            "NVIDIA GeForce RTX 4080 16GB" to "NVIDIA GeForce RTX 4080 16GB desc p",
            "NVIDIA GeForce RTX 4090 24GB" to "NVIDIA GeForce RTX 4090 24GB desc p",

            ///////MEMORY////////
            "Thermaltake TOUGHRAM RGB 32GB (2 x 16GB) DDR4-3600" to "Thermaltake TOUGHRAM RGB 32GB desc p",
            "ADATA XPG Spectrix D60G 16GB (2 x 8GB) DDR4-3200" to "ADATA XPG Spectrix D60G 16GB desc p",
            "Patriot Viper Steel 16GB (2 x 8GB) DDR4-3733" to "Patriot Viper Steel 16GB desc p",
            "Kingston FURY Beast 32GB (2 x 16GB) DDR4-3600" to "Kingston FURY Beast 32GB desc p",
            "Team T-FORCE Vulcan Z 8GB (2 x 4GB) DDR4-3000" to "Team T-FORCE Vulcan Z 8GB desc p",
            "Crucial Ballistix 16GB (2 x 8GB) DDR4-3200" to "Crucial Ballistix 16GB desc p",
            "G.Skill Ripjaws V 16GB (2 x 8GB) DDR4-3600" to "G.Skill Ripjaws V 16GB desc p",
            "Corsair Vengeance LPX 32GB (2 x 16GB) DDR4-3200" to "Corsair Vengeance LPX 32GB desc p" ,
            "G.Skill Trident Z Royal 64GB (4 x 16GB) DDR4-4000" to "G.Skill Trident Z Royal 64GB desc p",
            "Corsair Dominator Platinum RGB 32GB (2 x 16GB) DDR4-3600" to "Corsair Dominator Platinum RGB 32GB desc p",

            ///////STORAGE  ////////
            "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION" to "Seagate Skyhawk ST1000VX005 1TB 3.5 Hard Disk Drive SEIN469 1ION desc p",
            "Adata SC750 500GB external SSD 500GB BLACK" to "Adata SC750 500GB external SSD 500GB BLACK desc p",
            "Adata SC750 External SSD 1TB" to "Adata SC750 External SSD 1TB desc p",
            "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD" to "Samsung Portable SSD T7 Shield USB 3.2 1TB or 2TB SSD desc p",
            "Seagate Barracuda 2TB HDD" to "Seagate Barracuda 2TB HDD desc p",
            "Crucial MX500 1TB SATA III SSD" to "Crucial MX500 1TB SATA III SSD desc p",
            "Samsung 870 QVO 2TB SATA III SSD" to "Samsung 870 QVO 2TB SATA III SSD desc p",
            "Western Digital WD Black SN750 500GB NVMe SSD" to "Western Digital WD Black SN750 500GB NVMe SSD desc p" ,
            "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD" to "Seagate FireCuda 520 1TB NVMe PCIe Gen4 SSD desc p",
            "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD" to "Samsung 980 PRO 2TB NVMe PCIe 4.0 SSD desc p",

            ///////SUPPLY  ////////
            "Gigabyte P450B 450 watts 80 Plus Bronze Power Supply" to " Gigabyte P450B 450 watts desc p",
            "MSI MAG A650BN 650Watts/ A550BN 550Watts 80+ Non Modular Power Supply Bronze" to "MSI MAG A650BN 650Watts/ A550BN 550Watts desc p",
            "Corsair CX750 750 watts 80 Plus Bronze Power Supply" to "Corsair CX750 750 watts 80 Plus Bronze Power Supply desc p",
            "MSI MPG A1000G 1000W 80+ Gold Fully Modular Power Supply" to "MSI MPG A1000G 1000W desc p",
            "Thermaltake Smart 500W 80+ White" to "Thermaltake Smart 500W desc p",
            "Cooler Master MWE Bronze 650W 80+ Bronze" to "Cooler Master MWE Bronze 650W desc p",
            "Corsair RM750x 750W 80+ Gold" to "Corsair RM750x 750W desc p",
            "EVGA SuperNOVA 850 G3 850W 80+ Gold" to "EVGA SuperNOVA 850 G3 850W desc p" ,
            "Seasonic Prime TX-1000 1000W 80+ Titanium" to "Seasonic Prime TX-1000 1000W desc p",
            "Corsair AX1600i 1600W 80+ Titanium" to "Corsair AX1600i 1600W desc p",

            ///////CASE  ////////
            "Fractal Design Meshify C" to " Fractal Design Meshify C desc p",
            "Cooler Master MasterBox TD500 Mesh" to " Cooler Master MasterBox TD500 Mesh desc p",
            "Phanteks Eclipse P600S" to "Phanteks Eclipse P600S desc p",
            "Corsair Crystal Series 680X RGB" to "Corsair Crystal Series 680X RGB desc p",
            "NZXT H510 Elite" to "NZXT H510 Elite desc p",
            "Fractal Design Define 7 XL" to "Fractal Design Define 7 XL desc p",
            "Phanteks Enthoo Elite" to "Phanteks Enthoo Elite desc p",
            "Cooler Master Cosmos C700M" to "Cooler Master Cosmos C700M desc p" ,
            "Corsair Obsidian 1000D" to "Corsair Obsidian 1000D desc p",
            "NZXT H710i" to "NZXT H710i desc p",
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
