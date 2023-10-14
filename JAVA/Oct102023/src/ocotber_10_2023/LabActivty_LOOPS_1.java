package ocotber_10_2023;
import java.util.Scanner;
//1. Create a program that enters an odd number continuously 
//the program will terminate if the user input is an even number
public class LabActivty_LOOPS_1 {
     public static void main (String [] args){
         Scanner MyObj = new Scanner(System.in);
         int num;
         
         do {
             System.out.print("Enter a number: ");
             num = MyObj.nextInt();
         }
             
         while(num % 2 != 0);
            if (num % 2 == 0){ 
                System.out.println("Even Number NO ples");
            }
     }
}

