package jjokka;

public class ex06 {
    public static void main(String[] args) {
        int num = 77;
        int num2 = 0;
        for(int i = 1; i<=77; i++){
            num2 = num2 + (i * num);
            num--;
        }
        System.out.println(num2);
    }
    
}
