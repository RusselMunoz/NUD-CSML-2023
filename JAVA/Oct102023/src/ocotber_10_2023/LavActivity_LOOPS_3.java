package ocotber_10_2023;
import java.util.Scanner;
//3. Factorail 4! = 4*3*2*1=24
public class LavActivity_LOOPS_3 {
    public static void main (String [] args){
        Scanner MyObj = new Scanner(System.in);
        
        int fact = 1;
        
        System.out.println("Enter Number: ");
        int num = MyObj.nextInt();
        
        for (int i=1; i <= num; i++){
            fact *= i;
            
                System.out.println(i);
        }
                System.out.println(num + "= " + fact);
    }
}
/* for (starting = 1; starting >= ending; starting++)
             starting = tables* starting + starting;
            System.out.print(starting);

while (starting < ending){
            System.out.print(starting);   
            starting++;

num - 1 */ 
