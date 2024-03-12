package Final;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		
		int[] in = new int[10];
		
		int num = 1;
		int out = 0;
		
		for(int i = 0; i < in.length; i++) {
			in[i] = num;
			num++;
		}
		
		out = in[0];
		
		for(int i = 1; i < in.length; i++) {
			out *= in[i];
		}
		
		System.out.println(out);
		
	}

}
