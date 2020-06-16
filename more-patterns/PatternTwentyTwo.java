package patterns;

import java.util.Scanner;

public class PatternTwentyTwo {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		/*
		 			   1
					  212
					 32123
					4321234
					 32123
					  212
					   1
		 */
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=number-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			for(int k=2; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=number-1; i>0; i--) {
			for(int j=1; j<=number-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			for(int k=2; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
