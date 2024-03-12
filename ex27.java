package jjokka;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int result = 0;
        int adder = 1;

        for (int i = 0; i < c.length(); i++) {
            if(c.charAt(i) == 'o') {
                result += adder;
                adder++;
            } else {
                adder = 1;
            }
        }

        System.out.println(result);
        
    }
}
