package patterns;

import java.util.Scanner;

public class PatternSix {
	
	/*
	 	1
		22
		333
		4444
	 */
	
	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
