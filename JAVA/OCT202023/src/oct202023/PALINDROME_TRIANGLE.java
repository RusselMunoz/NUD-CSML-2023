package oct202023;
public class PALINDROME_TRIANGLE {
    public static void main(String[] args) {
        int a,c;
        int b = 4;
        for (a = 1; a <= b; a++) {
            for(c = 1; c <= 2 * (b - a); c++){
                System.out.print(" ");
            }
            for (c = a; c >= 1; c--){
                System.out.print(c + " ");
            }
            for (c = 2; c <= a; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}