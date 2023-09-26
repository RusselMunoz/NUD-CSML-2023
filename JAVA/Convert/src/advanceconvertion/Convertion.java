package advanceconvertion;
import java.util.Scanner;
public class Convertion {

	public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.print("Convert Peso to 5 Currencies: ");
        int peso = skan.nextInt();

        // Define conversion factors and currency names
        String[] currencies = {"US Dollar", "Japan Yen", "UAE Dirham", "South Korean Won", "Indian Rupee"};
        double[] conversionFactors = {0.018, 2.59, 0.064, 23.34, 1.46};

        // Calculate and display converted amounts
        for (int i = 0; i < currencies.length; i++) {
            double convertedAmount = peso * conversionFactors[i];
            System.out.println(currencies[i] + ": " + convertedAmount);
        }

        skan.close();
    }
}