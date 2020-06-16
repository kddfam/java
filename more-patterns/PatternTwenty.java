package patterns;

import java.util.Scanner;

public class PatternTwenty {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		/*
		 		1 2 3 4 5 
				 2 3 4 5 
				  3 4 5 
				   4 5 
				    5 
				   4 5 
				  3 4 5 
				 2 3 4 5 
				1 2 3 4 5 
		 */
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=number; j++) {
				int num = j;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for(int i=number-1; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=i; j<=number; j++) {
				int num = j;
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
