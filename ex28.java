package jjokka;

public class ex28 {
    public static void main(String[] args) {
        String str = "01001101";
        int base = 1;
        int result = 0;

        for (int i = str.length()-1 ; i >= 0; i--) {
            if(str.charAt(i) == '1'){
                result += base;
            }
            base *= 2;
        }
        
        System.out.println(result);
    }
}
