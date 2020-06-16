package lecture3;

import java.util.Scanner;

public class StarPattern1 {

	static Scanner sc;
	static int rows;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=rows-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int m=1; m<i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
