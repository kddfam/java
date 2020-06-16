package patterns;

import java.util.Scanner;

public class PatternFive {
	
	/*
		  *
		  **
		  ***
		  ****
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
