package compute_area;
import java.util.Scanner;

public class Comput_area {
	
	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		
		//Area of Square Input
		System.out.println("Compute Area of Square");
		System.out.print("Enter sidelength: ");
		int sidelength = skan.nextInt();
		int sumsquare = sidelength * sidelength;
		System.out.println("Area of Square: " + sumsquare);
		
		/*Space*/ System.out.println("");
		
		//Area of Rectangle
		System.out.println("Compute Area of Rectangle");
		System.out.print("Enter length: ");
		int length = skan.nextInt();
		System.out.print("Enter width: ");
		int width = skan.nextInt();
		int sumrec = width * length;
		System.out.println("Area of Rectangle: " + sumrec);
		
		/*Space*/ System.out.println("");
		
		//Area of Triangle
		System.out.println("Compute Area of Triangle");
		System.out.print("Enter base: ");
		int  base = skan.nextInt();
		System.out.print("Enter height: ");
		int height = skan.nextInt();
		double sumtri = (height * base) / 2;
		System.out.println("Area of Triangle: " + sumtri);
		skan.close();
		}
	}
