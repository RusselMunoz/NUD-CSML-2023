package oct62023;
import java.util.Scanner;
public class Activity_2_Bonus {
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your sales today: ");
        int sale = myObj.nextInt();
        double commission;
        
        if (sale >= 10000 && sale <= 20000){
            commission = sale * 0.05;
            System.out.println("Commision amount: " + commission);
        } else if (sale >= 20000 && sale <= 50000){
            commission = sale * 0.10;
            System.out.println("Commision amount:  " + commission);
        }else if (sale > 50000){
            commission = sale * 0.10 + 2000;
            System.out.println("Commision amount: " + commission);      
        }
    }
}
