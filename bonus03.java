package jjokka;

public class bonus03 {
    public static void main(String[] args) {
        System.out.println(cal(4, 7, '*'));
    }

    public static int cal(int num1, int num2, char op){
        if(op == '+'){
            return num1 + num2;
        }
        if(op == '-'){
            return num1 - num2;
        }
        if(op == '*'){
            return num1 * num2;
        }
        if(op == '/'){
            return num1 / num2;
        }

        return 0;
    }
}
