package patterns;

import java.util.Scanner;

public class PatternTwo {
	
	/*
	 	1234
		1234
		1234
		1234
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}
