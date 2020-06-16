package patterns;

import java.util.Scanner;

public class PatternFiveteen {
	
	/*
	 		* * * * * 
			* * * * 
			* * * 
			* * 
			* 
	 */
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=number; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
