package ocotber_10_2023;
import java.util.Scanner;
//2. Determine if the number is an even or odd
public class LabActivity_LOOPS_2 {
    public static void main (String [] args){
        Scanner MyObj = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = MyObj.nextInt();
            
            while (num <= 100){  
            if (num % 2 == 0){
                System.out.println(num + " Even Number");
                num++;
            }else{
                System.out.println(num + " Enter Odd");
                num++;
            }
         }
    }
}
            