package patterns;

import java.util.Scanner;

public class PatternEighteen {
	
	/*
	 			    *
				   **
				  ***
				 ****
				*****
				 ****
				  ***
				   **
				    *
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=number-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=number-1; i>0; i--) {
			for(int j=i; j<number; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
