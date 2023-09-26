package celsiustofahrenheit;
import java.util.Scanner;

public class Celsiustofahrenheit {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("Conver Celsius to Fahrenheit");
		System.out.print("Enter Celsius: ");
		int celsius = skan.nextInt();
		
		//Celsius to Fahrenheit
		double sum = (celsius * 9/5) + 32;
		
		System.out.println("Fahrenheit: " + sum);
		skan.close();
	}

}
