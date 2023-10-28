package oct202023;
public class NUMBER_TRIANGULAR {
    public static void main(String[] args) {
        int a,c;
        for (a = 1; a <= 4; a++) {
            for(c = 1; c <= 4 - a; c++){
                System.out.print(" ");
            }for(c = 1; c <= a; c++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
