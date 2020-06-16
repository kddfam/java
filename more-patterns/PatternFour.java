package patterns;

import java.util.Scanner;

public class PatternFour {

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		/*
		 	4444
			4444
			4444
			4444
		 */
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				System.out.print(number);
			}
			System.out.println();
		}
		
	}
	
}
