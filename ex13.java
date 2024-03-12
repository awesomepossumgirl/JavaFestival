package jjokka;

import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        String[] s = score.split(",");
        int[] result = {0, 0, 0, 0, 0};

        for (int i = 0; i < s.length; i++) {
            if(s[i].equals("A")) {
                result[0]++;
            }
            if(s[i].equals("B")) {
                result[1]++;
            }
            if(s[i].equals("C")) {
                result[2]++;
            }
            if(s[i].equals("D")) {
                result[3]++;
            }
            if(s[i].equals("F")) {
                result[4]++;
            }
        }

        System.out.println("A : " + result[0] + "명");
        System.out.println("B : " + result[1] + "명");
        System.out.println("C : " + result[2] + "명");
        System.out.println("D : " + result[3] + "명");
        System.out.println("F : " + result[4] + "명");
    }
}
