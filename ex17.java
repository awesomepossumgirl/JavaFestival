package jjokka;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("3의 배수 : ");
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 3 == 0){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
