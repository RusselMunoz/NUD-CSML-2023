package act1;
import java.util.Scanner;

public class act11 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("Computer Area of Square, Rectangle and Triangle");
		System.out.println("Enter sidelength, length, width for rectangle, base and height");
		
		//Area of Square Input
		int sidelength = skan.nextInt();
		
		//Area of Rectangle
		int length = skan.nextInt();
		int width = skan.nextInt();
		
		//Area of Triangle
		int  base = skan.nextInt();
		int height = skan.nextInt();
		
		//Calculation for Square
		int sumsquare = sidelength * sidelength;
		
		//Calculation for Rectangle
		int sumrec = length * width;
		
		//Calculation for Triangle
		double sumtri = (base * height) / 2;
		
		//Output
		System.out.println("Area of Square: " + sumsquare);
		System.out.println("Area of Rectangle: " + sumrec);
		System.out.println("Area of Triangle: " + sumtri);
		}
	}

