package jjokka;

public class ex03 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.print(-i + " ");
                num -= i;
            }
            if(i%2 == 1){
                System.out.print(i + " ");
                num += i;
            }
            
        }
        System.out.println("결과 : " + num);
    }
    
}
