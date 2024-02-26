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
        
        public static Map<String, Double> getFANPrices() {
            Map<String, Double> fanPrices = new HashMap<>();
            fanPrices.put("", 0.0);
            fanPrices.put("Corsair RM850X 850w", 200.0);
            fanPrices.put("EVGA 550 BP", 200.0);
            fanPrices.put("Thermaltake Touchpower GF3 1350W", 150.0);
            fanPrices.put("Asus ROG Thor 1000W", 200.0);
            fanPrices.put("EVGA Supernova 850GM", 150.0);
            return fanPrices;
        }

        public static String[] getMotherBoardArray() {
            return new String[]{" ", "MSI MEG Z490 GODLIKE", "ASUS ROG Strix B550-F RGB", "ASUS TUF Gaming B550M-PLUS", "MSI MPG X570 GAMING PRO Carbon", "MSI MAG B550M Mortar WiFi Gaming"};
        }
        
        public static Map<String, Double> getMotherboardPrices() {
            Map<String, Double> motherboardPrices = new HashMap<>();
            motherboardPrices.put("", 0.0);
            motherboardPrices.put("MSI MEG Z490 GODLIKE", 200.0);
            motherboardPrices.put("ASUS ROG Strix B550-F RGB", 200.0);
            motherboardPrices.put("ASUS TUF Gaming B550M-PLUS", 150.0);
            motherboardPrices.put("MSI MPG X570 GAMING PRO Carbon", 200.0);
            motherboardPrices.put("MSI MAG B550M Mortar WiFi Gaming", 150.0);
            return motherboardPrices;
        }
        

        public static String[] getStorageArray() {
            return new String[]{" ", "SanDisk Pro-G40 SSD", "WD My Passport", "Silicon Power PX10", "Crucial X10", "LaCie Rugged RAID Pro"};
        }
        
        public static Map<String, Double> getStoragePrices() {
            Map<String, Double> storagePrices = new HashMap<>();
            storagePrices.put("", 0.0);
            storagePrices.put("SanDisk Pro-G40 SSD", 200.0);
            storagePrices.put("WD My Passport", 200.0);
            storagePrices.put("Silicon Power PX10", 150.0);
            storagePrices.put("Cucial X10", 200.0);
            storagePrices.put("LaCie Ruged RAID Pro", 150.0);
            return storagePrices;
        }

        public static String[] getCPUArray() {
            return new String[]{" ", "AMD Ryzen 5 3600", "Intel Core i5-10400", "AMD Ryzen 7 3700X", "Intel Core i5-9600K", "AMD Athlon 3000G"};
        }
        
        public static Map<String, Double> getCPUPrices() {
            Map<String, Double> cpuPrices = new HashMap<>();
            cpuPrices.put("", 0.0);
            cpuPrices.put("AMD Ryzen 5 3600", 200.0);
            cpuPrices.put("Intel Core i5-10400", 200.0);
            cpuPrices.put("AMD Ryzen 7 3700X", 150.0);
            cpuPrices.put("Intel Core i5-9600K", 200.0);
            cpuPrices.put("AMD Athlon 300G", 150.0);
            return cpuPrices;
        }

        public static String[] getRAMArray() {
            return new String[]{" ", "HyperX Fury 8GB 2666MHz", "OLOy DDR4 RAM 16GB", "Corsair Vengeance LPX", "Crucial Ballistix 3200","OLOy 3000 16GB"};
        }
        
        public static Map<String, Double> getRAMPrices() {
            Map<String, Double> ramPrices = new HashMap<>();
            ramPrices.put("", 0.0);
            ramPrices.put("HyperX Fury 8GB 2666Mhz", 200.0);
            ramPrices.put("OLOy DDR4 RAM 16GB", 200.0);
            ramPrices.put("Corsair Vengeance LPX", 150.0);
            ramPrices.put("Crucial Ballistx 3200", 200.0);
            ramPrices.put("OLoy 3000 16GB", 150.0);
            return ramPrices;
        }

        public static String[] getCaseArray() {
            return new String[]{" ", " "};
        }
        
        public static Map<String, Double> getCasePrices() {
            Map<String, Double> casePrices = new HashMap<>();
            casePrices.put("", 0.0);
            casePrices.put("MSI MEG Z490 GODLIKE", 200.0);
            casePrices.put("ASUS ROG Strix B550-F RGB", 200.0);
            casePrices.put("Thermaltake Touchpower GF3 1350W", 150.0);
            casePrices.put("ASUS TUF Gaming B550M-PLUS", 200.0);
            casePrices.put("EVGA Supernova 850GM", 150.0);
            return casePrices;
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
