package oct202023;
public class NUMBER_INCREASING_REVERSE_PYRAMID {
    public static void main(String[] args) {
        int a, c;
        int b = 5;
        for ( a = 1; a <= b; a++){
            for ( c = 1; c <= b - a; c++){
                System.out.print(c + " ");
            }
        System.out.println();
        }
    }
}