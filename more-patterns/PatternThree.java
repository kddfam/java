package patterns;

import java.util.Scanner;

public class PatternThree {
	
	/*
	 	4321
		4321
		4321
		4321
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=number; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
}
