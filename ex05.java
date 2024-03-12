package jjokka;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int n = 1; n < i; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
