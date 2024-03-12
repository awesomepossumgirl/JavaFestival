package jjokka;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("일한 시간을 입력하세요 : ");
        int time = sc.nextInt();
        int money = 5000;
        if(time <= 8){
            System.out.println("총 임금은 : "+time*5000+"원 입니다.");
        }else if(time > 8){
            System.out.println("총 임금은 : " + (int) ((8 * 5000)+((time-8)*(money*1.5)))+"원 입니다");
        }
        sc.close();
    }
    
}
