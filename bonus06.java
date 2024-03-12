package jjokka;

public class bonus06 {
    public static void main(String[] args) {
        System.out.println(powerN(2, 3));
    }

    public static int powerN(int base, int n){
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= base;
        }

        return result;
    }
}
