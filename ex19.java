package jjokka;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("단수입력 :");
        a = sc.nextInt();

        System.out.print("어느 수까지 출력 : ");
        b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}
