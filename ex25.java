package jjokka;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        String nums = sc.nextLine();
        int result = 0;

        for (int i = 0; i < nums.length(); i++) {
            result += c[nums.charAt(i) - 48];            
        }

        System.out.println(result);

    }
}
