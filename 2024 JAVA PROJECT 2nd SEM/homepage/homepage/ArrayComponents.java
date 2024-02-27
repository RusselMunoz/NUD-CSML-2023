package homepage;

import java.util.HashMap;
import java.util.Map;

public class ArrayComponents {
    public class ArrayComponent {
        public static String[] getGPUArray() {
            return new String[]{" ", "Zotac Gaming RTX 3050", "Gigabyte GeForce GTX 1650"};
        }

        // Method to get GPU arrays and prices
        public static Map<String, Double> getGPUPrices() {
            Map<String, Double> gpuPrices = new HashMap<>();
            gpuPrices.put(" ", 0.0);
            gpuPrices.put("Zotac Gaming RTX 3050", 200.0);
            gpuPrices.put("Gigabyte GeForce GTX 1650", 150.0);
            return gpuPrices;
        }

        public static String[] getPSUArray() {
            return new String[]{" ", "Corsair RM850X 850w", "EVGA 550 BP", "Thermaltake Touchpower GF3 1350W", "Asus ROG Thor 1000W", "EVGA Supernova 850GM"};
        }

        public static Map<String, Double> getPSUPrices() {
            Map<String, Double> psuPrices = new HashMap<>();
            psuPrices.put(" ", 0.0);
            psuPrices.put("Corsair RM850X 850w", 200.0);
            psuPrices.put("EVGA 550 BP", 200.0);
            psuPrices.put("Thermaltake Touchpower GF3 1350W", 150.0);
            psuPrices.put("Asus ROG Thor 1000W", 200.0);
            psuPrices.put("EVGA Supernova 850GM", 150.0);
            return psuPrices;
        }

        public static String[] getFANArray() {
            return new String[]{" ", "DEEP COOL", "DARK FLASH", "GSTORM", "CORSAIR", "THERMALTAKE"};
        }
        
        public static Map<String, Double> getFANPrices() {
            Map<String, Double> fanPrices = new HashMap<>();
            fanPrices.put(" ", 0.0);
            fanPrices.put("DEEP COOL", 200.0);
            fanPrices.put("DARK FLASH", 200.0);
            fanPrices.put("GSTORM", 150.0);
            fanPrices.put("CORSAIR", 200.0);
            fanPrices.put("THERMALTAKE", 150.0);
            return fanPrices;
        }

        public static String[] getMotherBoardArray() {
            return new String[]{"", "MSI MEG Z490 GODLIKE", "ASUS ROG Strix B550-F RGB", "ASUS TUF Gaming B550M-PLUS", "MSI MPG X570 GAMING PRO Carbon", "MSI MAG B550M Mortar WiFi Gaming"};
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
            storagePrices.put(" ", 0.0);
            storagePrices.put("SanDisk Pro-G40 SSD", 200.0);
            storagePrices.put("WD My Passport", 200.0);
            storagePrices.put("Silicon Power PX10", 150.0);
            storagePrices.put("Crucial X10", 200.0);
            storagePrices.put("LaCie Ruged RAID Pro", 150.0);
            return storagePrices;
        }

        public static String[] getCPUArray() {
            return new String[]{" ", "AMD Ryzen 5 3600", "Intel Core i5-10400", "AMD Ryzen 7 3700X", "Intel Core i5-9600K", "AMD Athlon 3000G"};
        }
        
        public static Map<String, Double> getCPUPrices() {
            Map<String, Double> cpuPrices = new HashMap<>();
            cpuPrices.put(" ", 0.0);
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
            ramPrices.put(" ", 0.0);
            ramPrices.put("HyperX Fury 8GB 2666MHz", 200.0);
            ramPrices.put("OLOy DDR4 RAM 16GB", 200.0);
            ramPrices.put("Corsair Vengeance LPX", 150.0);
            ramPrices.put("Crucial Ballistix 3200", 200.0);
            ramPrices.put("OLoy 3000 16GB", 150.0);
            return ramPrices;
        }

        public static String[] getCaseArray() {
            return new String[]{" ", "NZXT", "ASUS TUF Gaming GT301 RGB TG with Fan Gaming Chassis", "INPLAY", "COOLER MASTER", "MSI Mag Forge 100R Tempered Glass ARGB Fans Mid-Tower Chassis (Black)"};
        }
        
        public static Map<String, Double> getCasePrices() {
            Map<String, Double> casePrices = new HashMap<>();
            casePrices.put(" ", 0.0);
            casePrices.put("NZXT", 200.0);
            casePrices.put("ASUS TUF Gaming GT301 RGB TG with Fan Gaming Chassis", 200.0);
            casePrices.put("INPLAY", 200.0);
            casePrices.put("COOLER MASTER", 200.0);
            casePrices.put("MSI Mag Forge 100R Tempered Glass ARGB Fans Mid-Tower Chassis (Black)", 150.0);
            return casePrices;
        }

        //Region Array
        public static String[] getGPURegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getGPU_REGIONPrices() {
            Map<String, Double> gpuPrices = new HashMap<>();
            gpuPrices.put("", 0.0);
            gpuPrices.put("Alabang", 200.0);
            gpuPrices.put("Bacoor", 200.0);
            gpuPrices.put("Makati", 150.0);
            return gpuPrices;
        }

        public static String[] getPSURegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getPSU_REGIONPrices() {
            Map<String, Double> psuPrices = new HashMap<>();
            psuPrices.put("", 0.0);
            psuPrices.put("Alabang", 200.0);
            psuPrices.put("Bacoor", 200.0);
            psuPrices.put("Makati", 150.0);
            return psuPrices;
        }

        public static String[] getFANRegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getFAN_REGIONPrices() {
            Map<String, Double> fanPrices = new HashMap<>();
            fanPrices.put("", 0.0);
            fanPrices.put("Alabang", 200.0);
            fanPrices.put("Bacoor", 200.0);
            fanPrices.put("Makati", 150.0);
            return fanPrices;
        }

        public static String[] getMOTHERBOARDRegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getMOTHEBOARD_REGIONPrices() {
            Map<String, Double> motherboardPrices = new HashMap<>();
            motherboardPrices.put("", 0.0);
            motherboardPrices.put("Alabang", 200.0);
            motherboardPrices.put("Bacoor", 200.0);
            motherboardPrices.put("Makati", 150.0);
            return motherboardPrices;
        }

        public static String[] getSTORAGERegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getSTORAGE_REGIONPrices() {
            Map<String, Double> storagePrices = new HashMap<>();
            storagePrices.put("", 0.0);
            storagePrices.put("Alabang", 200.0);
            storagePrices.put("Bacoor", 200.0);
            storagePrices.put("Makati", 150.0);
            return storagePrices;
        }

        public static String[] getCPURegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getCPU_REGIONPrices() {
            Map<String, Double> cpuPrices = new HashMap<>();
            cpuPrices.put("", 0.0);
            cpuPrices.put("Alabang", 200.0);
            cpuPrices.put("Bacoor", 200.0);
            cpuPrices.put("Makati", 150.0);
            return cpuPrices;
        }

        public static String[] getRAMRegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }

        public static Map<String, Double> getRAM_REGIONPrices() {
            Map<String, Double> ramPrices = new HashMap<>();
            ramPrices.put("", 0.0);
            ramPrices.put("Alabang", 200.0);
            ramPrices.put("Bacoor", 200.0);
            ramPrices.put("Makati", 150.0);
            return ramPrices;
        }

        public static String[] getCASERegionArray() {
            return new String[]{" ", "Alabang", "Bacoor", "Makati"};
        }
        
        public static Map<String, Double> getCASE_REGIONPrices() {
            Map<String, Double> casePrices = new HashMap<>();
            casePrices.put("", 0.0);
            casePrices.put("Alabang", 200.0);
            casePrices.put("Bacoor", 200.0);
            casePrices.put("Makati", 150.0);
            return casePrices;
        }
    
    }

    public static double getComponentPrice(String component, Map<String, Double> componentPrices) {
        return componentPrices.getOrDefault(component, 0.0);
    }

    // Method to get the shipping fee based on the selected region
    public static double getShippingFee(String region, Map<String, Double> regionPrices) {
        return regionPrices.getOrDefault(region, 0.0);
    }
}
