package computegrade;
import java.util.Scanner;

public class Classcompute {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("Enter Midterm and Final Grade");
		int midterm = skan.nextInt();
		int finalgrade = skan.nextInt();
		int sum = (midterm + finalgrade) / 2;
		
		System.out.println("Your average grade: " + sum); 
		skan.close();
	}

}