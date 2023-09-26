package munoz;
import java.util.Scanner;
public class Elapsedtime {

	public static void main(String[] args) {
		Scanner myObj =  new Scanner (System.in);
		int seconds, elapsed, hours, minutes;
		
		System.out.print("Enter hours: ");
		hours = myObj.nextInt();
		
		
		System.out.print("Enter minutes: ");
		minutes = myObj.nextInt();
		
		
		System.out.print("Enter seconds: ");
		seconds = myObj.nextInt();
		
		elapsed = (hours*60*60) + (minutes*60) + seconds;
		
		System.out.println("The elapsed time you entered: " + hours + ":" + minutes + ":" + seconds);
		System.out.println("In seconds " + elapsed);
		
		myObj.close();

	}

}
