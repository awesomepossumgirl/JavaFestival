package jjokka;

import java.util.Random;

public class ex18 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] nums = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 6; i++) {
            int t = rd.nextInt(6)+1;

            for(int j = 0; j < 6; ){
                if(nums[j] == t){
                    t = rd.nextInt(6)+1;
                    j = 0;
                } else {
                    j++;
                }
            }

            nums[i] = t;
            System.out.println("행운의 숫자 : " + t);

        }
    }
}
