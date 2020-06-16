package patterns;

import java.util.Scanner;

public class PatternEight {
	
	/*
	 	ABCD
		ABCD
		ABCD
		ABCD
	 */
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				char toPrint = (char) ('A'+(j-1));
				System.out.print(toPrint);
			}
			System.out.println();
		}
		
	}

}
