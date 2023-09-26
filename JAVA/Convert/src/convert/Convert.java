package convert;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.print("Convert Peso to 5 Currencies: ");
		int peso = skan.nextInt();
		
		//us dollar conversion = 0.018
		double usdollar = peso * 0.018;
		
		//japanese yen conversion = 2.59
		double japyen = peso * 2.59;
		
		//uae dirham conversion = 0.64
		double uaedirham = peso * 0.064;
		
		//south korean won conversion = 23.34
		double korwon = peso * 23.34;
		
		//indian rupee = 1.46
		double indrupee = peso * 1.46;
		
		System.out.println("US Dollar: " + usdollar);
		System.out.println("Japan Yen: " + japyen);
		System.out.println("UAE Dirham: " + uaedirham);
		System.out.println("South Korean Won: " + korwon);
		System.out.println("Indian Rupee: " + indrupee);
		skan.close();
	}

}
