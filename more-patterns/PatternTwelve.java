package patterns;

import java.util.Scanner;

public class PatternTwelve {
	
	/*
	 	D
		CD
		BCD
		ABCD
	 */
	
	static Scanner sc;
	static int number;
	
	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		char p = (char) ('A'+number-1);
		for(int i=0; i<=number-1; i++) {
			for(int j=i; j>=0; j--) {
				char toPrint = (char)(p-j);
				System.out.print(toPrint);
			}
			System.out.println();
		}
		
	}

}
