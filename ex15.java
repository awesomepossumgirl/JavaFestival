package jjokka;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 입력 : ");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 0; i < n; i++) {
            result += i;
            System.out.print(result + " ");
        }
    }
}
