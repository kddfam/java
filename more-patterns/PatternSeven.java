package patterns;

import java.util.Scanner;

public class PatternSeven {
	
	/*
	 	1
		21
		321
		4321
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			int p = i;
			for(int j=1; j<=i; j++) {
				System.out.print(p);
				p -= 1;
			}
			System.out.println();
		}
		
	}
	
}
