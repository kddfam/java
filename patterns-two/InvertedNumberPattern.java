package lecture5;

import java.util.Scanner;

public class InvertedNumberPattern {

	static Scanner sc;
	static int number;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=number; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
