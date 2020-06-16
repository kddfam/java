package lecture5;

import java.util.Scanner;

public class DiamondOfStars {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		// check number is odd
		if(number%2 == 0) {
			return;
		}
		
		// find upper and lower
		int upper = (number+1)/2; // 3
		int lower = number-upper; // 2 
		
		for(int i=1; i<=upper; i++) {
			for(int j=upper-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=lower; i>0; i--) {
			for(int j=i; j<=lower; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
