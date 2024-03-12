package Final;

import java.util.Random;
import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			int num = rd.nextInt(10)+1;
			int sum = rd.nextInt(10)+1;
			System.out.print(num + " + " + sum + " = ");
			int result = sc.nextInt();
			if(num+sum == result) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail...");
			}
		}
		System.out.println("GAME OVAR");
	}

}
