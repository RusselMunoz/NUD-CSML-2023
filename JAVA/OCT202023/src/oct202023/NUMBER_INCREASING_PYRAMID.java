package oct202023;
public class NUMBER_INCREASING_PYRAMID {
    public static void main(String[] args) {
        int b = 4;
        for (int a = 1; a <= b; a++) {
            for(int c = 1; c <= a; c++){
                System.out.print(c + " ");
            }
        System.out.println();
        }
    }
}
