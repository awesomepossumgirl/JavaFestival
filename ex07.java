package jjokka;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int num = sc.nextInt();
        for(int i = num; i > 0; i--){
            for(int n = 1; n < i; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
