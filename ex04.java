package jjokka;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 금액 입력 : ");
        int money = sc.nextInt();
        System.out.println("잔돈 : " + money);
        System.out.println("10000원 : " + money/10000);
        System.out.println("5000원 : " + money%10000/5000);
        System.out.println("1000원 : " + money%10000%5000/1000);
        System.out.println("500원 : " + money%10000%1000/500);
        System.out.println("100원 : " + money%10000%1000%500/100);

        sc.close();
    }        
}
