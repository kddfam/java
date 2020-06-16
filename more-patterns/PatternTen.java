package patterns;

import java.util.Scanner;

public class PatternTen {
	
	/*
	 	ABCD
		BCDE
		CDEF
		DEFG
	 */

	static Scanner sc;
	static int number;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				char toPrint = (char) ('@'+((j-1)+i));
				System.out.print(toPrint);
			}
			System.out.println();
		}

	}

}
