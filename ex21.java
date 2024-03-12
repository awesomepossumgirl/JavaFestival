package jjokka;

public class ex21 {
    public static void main(String[] args) {
        int[] point = {92, 32, 52, 9, 81, 2, 68};
        int dist = 1000000000;
        int[] result = new int[2];

        for (int i = 0; i < point.length-1; i++) {

            for (int j = i+1; j < point.length; j++) {
                if(dist > Math.abs(point[i] - point[j])){
                    dist = Math.abs(point[i] - point[j]);
                    result[0] = i;
                    result[1] = j;
                }
            }

        }

        System.out.println("result = [" + result[0] + ", " + result[1] + "]");
    }
    
}
