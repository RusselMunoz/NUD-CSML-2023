package oct62023;
import java.util.Scanner;
public class Activity_4_Fare {
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int distance, passenger;
        double baseCost = 30.0;
        
        System.out.print("Enter distance (in km): ");
        distance = myObj.nextInt();
        
        double fare;
        if (distance <= 4) {
            fare = baseCost;
        } else {
            double additionalCost = 5.0 * (distance - 4);
            fare = baseCost + additionalCost;}
        
        System.out.println("TOTAL FARE: " + (int)fare);
        
        System.out.println("DISCOUNT TYPES:");
        System.out.println("0. REGULAR");
        System.out.println("1. STUDENTS");
        System.out.println("2. SENIOR CITIZEN");
        System.out.println("3. PWD");

        System.out.print("ENTER DISCOUNT TYPE: ");
        passenger = myObj.nextInt();
        
        double discount = (int)fare * 0.8;
        
        switch (passenger) {
            case 0:
                System.out.println("REGULAR");
                System.out.println("FARE: " + fare);
                
                System.out.print("AMOUNT TENDERED: ");
                int tendered = myObj.nextInt();
                
                int change = tendered - (int) fare;
                System.out.println("CHANGE: " + change);
                break;
            case 1:
                System.out.println("STUDENT");
                System.out.println("DISCOUNTED FARE: " + (int)discount);
                
                System.out.print("AMOUNT TENDERED: ");
                tendered = myObj.nextInt();
                
                change = tendered - (int)discount;
                System.out.println("CHANGE: " + change);
                break;
            case 2:
                System.out.println("SENIOR CITIZEN");
                System.out.println("DISCOUNTED FARE: " + (int)discount);
                
                System.out.print("AMOUNT TENDERED: ");
                tendered = myObj.nextInt();
                
                change = tendered - (int)discount;
                System.out.println("CHANGE: " + change);
                break;
            case 3:
                System.out.println("PWD");
                System.out.println("DISCOUNTED FARE: " + (int)discount);
                
                System.out.print("AMOUNT TENDERED: ");
                tendered = myObj.nextInt();
                
                change = tendered - (int)discount;
                System.out.println("CHANGE: " + change);
                break;
            default:
                System.out.println("Invalid passenger type.");
        }
     }
}