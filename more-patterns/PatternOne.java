package patterns;

import java.util.Scanner;

public class PatternOne {
	
	/*
		    1111
			2222
			3333
			4444
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
}
