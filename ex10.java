package jjokka;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] num = new int[8];

        int min = 0;
        int max = 0;

        System.out.print("배열에 있는 모든 값 : ");

        for (int i = 0; i < 8; i++) {
            num[i] = rd.nextInt(100) + 1;
            System.out.print(num[i] + " ");

        }

        max = num[0];
        min = num[0];

        for (int i = 1; i < 8; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }

        System.out.println();
        System.out.print("가장 큰 값 : " + max);
        System.out.println();
        System.out.println("가장 작은 값 : " + min);

    }
}
