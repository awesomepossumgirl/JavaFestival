package jjokka;

import java.util.Scanner;

public class bonus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cc = new int[5];


        // 숫자입력
        for (int i = 0; i < cc.length; i++) {
            System.out.print(i + "번째 별의 수 : ");
            cc[i] = sc.nextInt();
        }

        // 배열 순회
        for (int i = 0; i < cc.length; i++) {
            System.out.print(cc[i] + ":");

            // 별 출력
            for (int j = 0; j < cc[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
