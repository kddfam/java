package lecture5;

import java.util.Scanner;

public class StarPattern {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=number-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int l=1; l<i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
