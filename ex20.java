package jjokka;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] leejin = new int[20];

        for (int i = 0; i < leejin.length; i++) {
            leejin[i] = num%2;
            num /= 2;
        }

        for (int i = leejin.length-1; i >= 0; i--){
            System.out.print(leejin[i]);
        }
    }
}
