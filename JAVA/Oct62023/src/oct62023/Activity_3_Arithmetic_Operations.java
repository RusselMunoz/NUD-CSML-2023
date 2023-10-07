package oct62023;
import java.util.Scanner;
public class Activity_3_Arithmetic_Operations {
   public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);  
      int firstin, secin, result;
      char operator;
      
      System.out.print("Enter first integer: ");
      firstin = myObj.nextInt();
      
      System.out.print("Enter second integer: ");
      secin = myObj.nextInt();
      
      System.out.print("Enter operator: ");
      operator = myObj.next().charAt(0);
      
      switch (operator) {
          case '+':
              result = firstin + secin;
              System.out.println(firstin + " + " + secin + " = " + result);
              break;
          case '-':
              result = firstin - secin;
              System.out.println(firstin + " - " + secin + " = " + result);
              break;
          case '*':
              result = firstin * secin;
              System.out.println(firstin + " * " + secin + " = " + result);
              break;
          case '/':
              result = firstin / secin;
              System.out.println(firstin + " / " + secin + " = " + result);
              break;
          default:
              System.out.println("Invalid");
              break;
      }
   }
}
