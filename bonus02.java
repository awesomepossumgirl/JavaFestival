package jjokka;

public class bonus02 {
    public static void main(String[] args) {

        System.out.println(getMiddle("123456789"));
        
    }
    
    public static String getMiddle(String wrd){
        int center = wrd.length()/2 + 1;
        String result;
        if( wrd.length()%2 == 0){
            result = wrd.substring(center-2, center);    
        } else {
            result = wrd.substring(center-1, center);
        }

        return result;
    }
}
