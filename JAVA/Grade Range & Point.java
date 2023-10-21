package munoz;
import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        double midterm = scanner.nextDouble();

        System.out.print("Enter your finals score: ");
        double finals = scanner.nextDouble();

        double finalAverage = (midterm + finals) / 2;
        String gradePoint;
		
	int roundedFinalAverage = (int) finalAverage;

        if (roundedFinalAverage >= 96 && roundedFinalAverage <= 100) {
            gradePoint = "4.0";
        } else if (roundedFinalAverage >= 90 && roundedFinalAverage <= 95) {
            gradePoint = "3.5";
        } else if (roundedFinalAverage >= 84 && roundedFinalAverage <= 89) {
            gradePoint = "3.0";
        } else if (roundedFinalAverage >= 78 && roundedFinalAverage <= 83) {
            gradePoint = "2.5";
        } else if (roundedFinalAverage >= 72 && roundedFinalAverage <= 77) {
            gradePoint = "2.0";
        } else if (roundedFinalAverage >= 66 && roundedFinalAverage <= 71) {
            gradePoint = "1.5";
        } else if (roundedFinalAverage >= 60 && roundedFinalAverage <= 65) {
            gradePoint = "1.0";
        } else {
            gradePoint = "R";
        }

        System.out.println("Final Avg: " + roundedFinalAverage);
        System.out.println("Grade point: " + gradePoint);

        scanner.close();
    }
}
