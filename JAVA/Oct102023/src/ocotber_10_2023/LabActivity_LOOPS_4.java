package ocotber_10_2023;
import java.util.Scanner;
//4. Multiplication
public class LabActivity_LOOPS_4 {
    public static void main (String [] args) {
        Scanner MyObj = new Scanner(System.in);
        
        System.out.print("Enter the Starting number: ");
        int starting = MyObj.nextInt();
        System.out.print("Enter the Ending number: ");
        int ending = MyObj.nextInt();
        System.out.print("Enter the Tables number: ");
        int tables = MyObj.nextInt();
        
        while (starting <= ending){
            int sum = starting * tables;
            System.out.println(starting + " * " + tables + "= " + sum);   
            starting++;
        }
    }
}