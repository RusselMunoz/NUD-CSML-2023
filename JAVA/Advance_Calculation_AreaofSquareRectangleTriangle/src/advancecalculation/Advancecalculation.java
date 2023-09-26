package advancecalculation;
import java.util.Scanner;
public class Advancecalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		computeAndPrintArea("Rectangle", "length", scanner.nextDouble() * scanner.nextDouble());
		computeAndPrintArea("Triangle", "base", computeTriangleArea(scanner.nextDouble(), scanner.nextDouble()));
		
		scanner.close();
		}
	private static void computeAndPrintArea(String shape, String dimension, double area) {
		System.out.println("Area of " + shape + ": " + area + "\n");
		    }
	private static double computeTriangleArea(double base, double height) {
		return 0.5 * base * height;
	}
}
