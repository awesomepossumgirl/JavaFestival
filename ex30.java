package Final;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {

		System.out.println("그.. 그만.. 알고리즘 그만..");

		Scanner sc = new Scanner(System.in);
		int[] result = new int[26];
		String inPut = sc.nextLine().replaceAll(" ", "");
		System.out.println(inPut);
		String outPut = inPut.toLowerCase();
		for (int i = 0; i < inPut.length(); i++) {
			
			result[outPut.charAt(i) - 97]++;

		}
		for (int i = 0; i < 26; i++) {
			
			System.out.println((char) (i + 97) + " : " + result[i]);
		}

	}

}
