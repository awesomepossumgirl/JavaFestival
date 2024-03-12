package jjokka;

import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재몸무게 : ");
        int num = sc.nextInt();
        System.out.print("목표몸무게 : ");
        int num2 = sc.nextInt();
        int week = 1;
        while(true){
            System.out.print(week+"주자 감량 몸무게 : ");
            int num3 = sc.nextInt();
            num -= num3;
            week++;
            if(num<=num2){
                break;
            }
        }
        System.out.println(num+"kg 달성 ㅊㅊ");
        sc.close();
    }
}
