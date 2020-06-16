package lecture5;

import java.util.Scanner;

public class MirrorNumberPatter {
	
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
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
