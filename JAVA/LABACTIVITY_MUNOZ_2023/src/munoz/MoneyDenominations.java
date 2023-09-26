package munoz;
import java.util.Scanner;
public class MoneyDenominations {

	public static void main(String[] args) {
		Scanner myObj =  new Scanner (System.in);
		double amount, quarters, nickel, dime, penny;
		
		System.out.print("Enter hours: ");
		amount = myObj.nextInt();
		
		//Calculation
		quarters = amount / 25;
		nickel = (amount % 25) / 10;
		dime = (amount % 25) % 10 /5;
		penny = ((amount % 25) % 10) %5 /1;
		
		System.out.println(quarters);
		System.out.println(nickel);
		System.out.println(dime);
		System.out.println(penny);
		
		myObj.close();


	}

}
