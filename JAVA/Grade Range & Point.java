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

        if (finalAverage >= 96 && finalAverage <= 100) {
            gradePoint = "4.0";
        } else if (finalAverage >= 90 && finalAverage <= 95) {
            gradePoint = "3.5";
        } else if (finalAverage >= 84 && finalAverage <= 89) {
            gradePoint = "3.0";
        } else if (finalAverage >= 78 && finalAverage <= 83) {
            gradePoint = "2.5";
        } else if (finalAverage >= 72 && finalAverage <= 77) {
            gradePoint = "2.0";
        } else if (finalAverage >= 66 && finalAverage <= 71) {
            gradePoint = "1.5";
        } else if (finalAverage >= 60 && finalAverage <= 65) {
            gradePoint = "1.0";
        } else {
            gradePoint = "R";
        }

        int roundedFinalAverage = (int) finalAverage;

        System.out.println("Final Avg: " + roundedFinalAverage);
        System.out.println("Grade point: " + gradePoint);

        scanner.close();
    }
}
