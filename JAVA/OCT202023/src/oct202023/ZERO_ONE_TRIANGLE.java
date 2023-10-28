package oct202023;
public class ZERO_ONE_TRIANGLE {
    public static void main(String[] args) {
        int b = 4;
        for (int a = 1; a <= b; a++) {
            for(int c = 1; c <= a; c++){
                if ((a + c) % 2 == 0) {
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                    }
            }
            System.out.println();
        }
    }
}