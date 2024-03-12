package jjokka;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int result = 0;
        
        for (int i = 0; i < 8; i++) {
            result += num%10;
            num /= 10;
        }

        System.out.println(result);
    }
}
