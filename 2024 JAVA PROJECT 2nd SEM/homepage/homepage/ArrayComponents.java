package homepage;

import java.util.HashMap;
import java.util.Map;

public class ArrayComponents {
    public class ArrayComponent {
        public static String[] getGPUArray() {
            return new String[]{" ", "Zotac Gaming RTX 3050", "Gigabyte GeForce GTX 1650"};
        }

        // Method to get GPU prices
        public static Map<String, Double> getGPUPrices() {
            Map<String, Double> gpuPrices = new HashMap<>();
            gpuPrices.put("", 0.0);
            gpuPrices.put("Zotac Gaming RTX 3050", 200.0);
            gpuPrices.put("Gigabyte GeForce GTX 1650", 150.0);
            return gpuPrices;
        }

        public static String[] getPSUArray() {
            return new String[]{" ", "Corsair RM850X 850w", "EVGA 550 BP", "Thermaltake Touchpower GF3 1350W", "Asus ROG Thor 1000W", "EVGA Supernova 850GM"};
        }

        public static Map<String, Double> getPSUPrices() {
            Map<String, Double> psuPrices = new HashMap<>();
            psuPrices.put("", 0.0);
            psuPrices.put("Corsair RM850X 850w", 200.0);
            psuPrices.put("EVGA 550 BP", 200.0);
            psuPrices.put("Thermaltake Touchpower GF3 1350W", 150.0);
            psuPrices.put("Asus ROG Thor 1000W", 200.0);
            psuPrices.put("EVGA Supernova 850GM", 150.0);
            return psuPrices;
        }

        public static String[] getFANArray() {
            return new String[]{" "};
        }

        public static String[] getMotherBoardArray() {
            return new String[]{" ", "MSI MEG Z490 GODLIKE", "ASUS ROG Strix B550-F RGB", "ASUS TUF Gaming B550M-PLUS", "MSI MPG X570 GAMING PRO Carbon", "MSI MAG B550M Mortar WiFi Gaming"};
        }
        
        
         public static Map<String, Double> getMotherBoardPrices() {            
             Map<String, Double> motherboardPrices = new HashMap<>();
            motherboardPrices.put("", 0.0);
            motherboardPrices.put("Corsair RM850X 850w", 200.0);
            motherboardPrices.put("EVGA 550 BP", 200.0);
            motherboardPrices.put("Thermaltake Touchpower GF3 1350W", 150.0);
            psuPrices.put("Asus ROG Thor 1000W", 200.0);
            motherboardPrices.put("EVGA Supernova 850GM", 150.0);
            return motherboardPrices;
        }

        public static String[] getStorageArray() {
            return new String[]{" ", "SanDisk Pro-G40 SSD", "WD My Passport", "Silicon Power PX10", "Crucial X10", "LaCie Rugged RAID Pro"};
        }

        public static String[] getCPUArray() {
            return new String[]{" ", "AMD Ryzen 5 3600", "Intel Core i5-10400", "AMD Ryzen 7 3700X", "Intel Core i5-9600K", "AMD Athlon 3000G"};
        }

        public static String[] getRAMArray() {
            return new String[]{" ", "HyperX Fury 8GB 2666MHz", "OLOy DDR4 RAM 16GB", "Corsair Vengeance LPX", "Crucial Ballistix 3200","OLOy 3000 16GB"};
        }

        public static String[] getCaseArray() {
            return new String[]{" ", " "};
        }

        //Region Array
        public static String[] getGPURegionArray() {
            return new String[]{" ", "Region4a", "Region4B"};
        }

        public static String[] getPSURegionArray() {
            return new String[]{" ", "Region4a", "Region4B"};
        }
    
    }
    
}
